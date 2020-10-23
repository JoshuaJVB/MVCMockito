package com.Wozu.MVCMockito.service;

import com.Wozu.MVCMockito.repo.CommentRepo;
import com.Wozu.MVCMockito.model.Comment;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.sql.Date;
import java.util.Optional;

@Service
public class CommentServiceImpl implements CommentService {

	@Autowired
	CommentRepo repo;

	// =========================================================
    // GET
    // =========================================================

    @Override
    public Optional<Comment> getCommentById(Long id) {
    	return repo.findById(id);
    }

    @Override
    public Iterable<Comment> getAllComment() {
    	return repo.findAll();
    }


    // =========================================================
    // PUT
    // =========================================================

    @Override
    public Optional<Comment> updateComment(Comment newCommment, Long id) {
    	repo.findById(id).map(comment -> {
    		comment.setUserId(newCommment.getUserId());
    		comment.setHeading(newCommment.getHeading());
    		comment.setLastUpdated(new Date(System.currentTimeMillis()));
    		comment.setBody(newCommment.getBody());
    		return repo.save(comment);
    	});

    	return repo.findById(id);
    }


    // =========================================================
    // POST
    // =========================================================

    @Override
    public void saveComment(Comment comment) {
    	repo.save(comment);
    }


    // =========================================================
    // DELETE
    // =========================================================

    @Override
    public void removeCommentById(Long id) {
    	repo.deleteById(id);
    }

}