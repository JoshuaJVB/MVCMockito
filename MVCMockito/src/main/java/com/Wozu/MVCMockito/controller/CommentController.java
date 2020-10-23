package com.Wozu.MVCMockito.controller;

import com.Wozu.MVCMockito.model.Comment;
import com.Wozu.MVCMockito.service.CommentService;
import java.util.Optional;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class CommentController {

	private final CommentService service;

	// Dependency injection
	public CommentController(CommentService service) { this.service = service; }

	// =========================================================
    // GET
    // =========================================================

	@GetMapping("/get/comment/{id}")
	public Optional<Comment> getComment(@PathVariable Long id) {
		return service.getCommentById(id);
	}

	@GetMapping("/get/comment/all")
	public Iterable<Comment> getAllComment() {
		return service.getAllComment();
	}

    // =========================================================
    // POST
    // =========================================================

    @PostMapping("/post/comment")
    public String saveComment(@RequestBody Comment comment) {
    	service.saveComment(comment);
    	return "Comment (" + comment.getHeading() + ") saved.";
    }

    // =========================================================
    // PUT
    // =========================================================

    @PutMapping("/update/car/{id}")
    public Optional<Comment> updateComment(@RequestBody Comment newCommment, @PathVariable Long id) {
    	return service.updateComment(newCommment, id);
    }

    // =========================================================
    // DELETE
    // =========================================================

    @DeleteMapping("/delete/comment/{id}")
    public String removeComment(@PathVariable Long id) {
    	service.removeCommentById(id);
    	return "Comment with id (" + id + ") removed.";
    }


}