package com.Wozu.MVCMockito.service;

import com.Wozu.MVCMockito.model.Comment;
import java.util.Optional;

public interface CommentService {

	Optional<Comment> getCommentById(Long id);
	Iterable<Comment> getAllComment();
	Optional<Comment> updateComment(Comment newCommment, Long id);
	void saveComment(Comment comment);
	void removeCommentById(Long id);

}