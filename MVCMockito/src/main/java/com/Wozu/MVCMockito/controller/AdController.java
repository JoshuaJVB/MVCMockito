package com.Wozu.MVCMockito.controller;

import com.Wozu.MVCMockito.model.Ad;
import com.Wozu.MVCMockito.service.AdService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
public class AdController {
    final AdService adService;

    @Autowired
    public AdController(AdService adService) {
        this.adService = adService;
    }

    @PostMapping("/post/ad")
    public Ad createAd(@RequestBody Ad ad) { return adService.create(ad); }

    @GetMapping("/get/ad/{id}")
    public Ad readAd(@PathVariable Long id) { return adService.read(id); }

    @GetMapping("/get/ad")
    public Iterable<Ad> readAds() { return adService.reads(); }

    @PutMapping("/put/ad/{id}")
    public Ad updateAd(@RequestBody Ad ad, @PathVariable Long id) { return adService.update(ad, id); }

    @DeleteMapping("/delete/ad/{id}")
    public Ad deleteAd(@PathVariable Long id) { return adService.delete(id); }
}
