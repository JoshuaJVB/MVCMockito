package com.Wozu.MVCMockito.repo;

import com.Wozu.MVCMockito.model.Comment;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CommentRepo extends CrudRepository<Comment, Long> {}