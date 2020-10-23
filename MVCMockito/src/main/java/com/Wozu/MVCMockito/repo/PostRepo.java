package com.Wozu.MVCMockito.repo;

import com.Wozu.MVCMockito.model.Post;
import org.springframework.data.repository.CrudRepository;

public interface PostRepo extends CrudRepository<Post, Long> {
}
