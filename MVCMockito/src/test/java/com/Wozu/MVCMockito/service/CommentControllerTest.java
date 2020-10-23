package com.Wozu.MVCMockito.controller;

import java.sql.Date;
import com.Wozu.MVCMockito.model.Comment;
import com.Wozu.MVCMockito.repo.CommentRepo;
import com.Wozu.MVCMockito.service.CommentService;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;

@SpringBootTest
@ExtendWith(MockitoExtension.class)
public class CommentControllerTest {

	CommentController controller;
	Comment comment;

	@Mock
	CommentService service;

	@MockBean
	CommentRepo repo;

	@BeforeEach
	void setUp() {
		this.comment = new Comment();
		this.comment.setId(1L);
		this.comment.setHeading("Tye Porter");
		this.comment.setLastUpdated(new Date(System.currentTimeMillis()));
		this.comment.setBody("This is my first comment");
		this.comment.setUserId(1L);
		this.comment.setPostId(42L);

		this.controller = new CommentController(this.service);
	}

	@Test
	void testAddComment() {
		
	}

	@Test
	void testGetComment() {
		
	}

	@Test
	void testGetAllComment() {
		
	}

	@Test
	void testUpdateComment() {
		
	}

	@Test
	void testRemoveComment() {
		
	}

}