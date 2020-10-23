package com.Wozu.MVCMockito.service;

import com.Wozu.MVCMockito.model.Ad;

public interface AdService {
    Ad create(Ad ad);

    Ad read(Long id);
    Iterable<Ad> reads();

    Ad update(Ad ad, Long id);

    Ad delete(Long id);
}
