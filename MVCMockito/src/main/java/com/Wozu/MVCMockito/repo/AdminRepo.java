package com.Wozu.MVCMockito.repo;

import org.springframework.data.repository.CrudRepository;
import com.Wozu.MVCMockito.model.Admin;
import org.springframework.stereotype.Repository;

@Repository
public interface AdminRepo extends CrudRepository<Admin, Long> {

}
