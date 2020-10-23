package com.Wozu.MVCMockito.service;

import com.Wozu.MVCMockito.model.Ad;
import com.Wozu.MVCMockito.repo.AdRepo;
import com.Wozu.MVCMockito.service.AdService;
import com.Wozu.MVCMockito.service.AdServiceImpl;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

@DisplayName("Advertising")
@SpringBootTest(classes = {AdServiceImpl.class})
class AdServiceTest {
    Ad ad;

    @Autowired
    AdService adService;

    @MockBean
    AdRepo adRepo;

    @BeforeEach
    void beforeEach() {
        ad = new Ad(6L, "trucks", "buying", "Ford RAM", "The 2020 Rangers are Built Ford Tough®", "Get your Ranger today!");
        List<Ad> ads = new ArrayList<>();
        ads.add(ad);

        Mockito.when(adRepo.findAll()).thenReturn(ads);
        Mockito.when(adRepo.findById(42L)).thenReturn(java.util.Optional.of(ad));
        Mockito.when(adRepo.save(ad)).thenReturn(ad);
    }

    @Test
    void crud() {
        Iterable<Ad> expected = adService.reads();

        assertEquals(1, ((List<Ad>) expected).size());
        assertEquals("trucks", ((List<Ad>) expected).get(0).getCategory());

        assertEquals("trucks", adService.create(ad).getCategory());
        assertEquals("trucks", adService.read(42L).getCategory());
        assertEquals("trucks", adService.update(ad, 42L).getCategory());
        assertEquals("trucks", adService.delete(42L).getCategory());
    }
}