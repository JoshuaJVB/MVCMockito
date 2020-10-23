package com.Wozu.MVCMockito.repo;

import com.Wozu.MVCMockito.model.Ad;
import org.springframework.data.repository.CrudRepository;

public interface AdRepo extends CrudRepository<Ad, Long> {
}
