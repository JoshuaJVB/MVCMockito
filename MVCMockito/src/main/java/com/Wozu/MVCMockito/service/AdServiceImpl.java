package com.Wozu.MVCMockito.service;

import com.Wozu.MVCMockito.model.Ad;
import com.Wozu.MVCMockito.repo.AdRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class AdServiceImpl implements AdService {
    final AdRepo adRepo;

    @Autowired
    public AdServiceImpl(AdRepo adRepo) {
        this.adRepo = adRepo;
    }

    @Override
    public Ad create(Ad ad) {
        return adRepo.save(ad);
    }

    @Override
    public Ad read(Long id) {
        return adRepo.findById(id).get();
    }

    @Override
    public Iterable<Ad> reads() {
        return adRepo.findAll();
    }

    @Override
    public Ad update(Ad ad, Long id) {
        Optional<Ad> optionalAd = adRepo.findById(id);
        Ad newAd = optionalAd.get();

        newAd.setAdminId(ad.getAdminId());
        newAd.setCategory(ad.getCategory());
        newAd.setTag(ad.getTag());
        newAd.setAdvertiser(ad.getAdvertiser());
        newAd.setMessage(ad.getMessage());
        newAd.setCallToAction(ad.getCallToAction());

        return adRepo.save(newAd);
    }

    @Override
    public Ad delete(Long id) {
        Optional<Ad> optionalAd = adRepo.findById(id);
        Ad ad = optionalAd.get();

        adRepo.delete(ad);

        return ad;
    }
}
