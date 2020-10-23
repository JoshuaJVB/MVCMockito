package com.Wozu.MVCMockito;

import com.Wozu.MVCMockito.controller.PostController;
import com.Wozu.MVCMockito.model.Post;
import com.Wozu.MVCMockito.repo.PostRepo;
import com.Wozu.MVCMockito.service.PostService;
import com.Wozu.MVCMockito.service.PostServiceImpl;
import org.aspectj.lang.annotation.Before;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;

import java.util.ArrayList;
import java.util.List;

@SpringBootTest
@ExtendWith(MockitoExtension.class)
public class PostControllerTest {

    Post post;
    PostController postController;

    @Autowired
    PostServiceImpl postServiceImpl;

    @MockBean
    PostRepo postRepo;

    @BeforeEach
    void init(){
        post = new Post(12345L,"This is a test post");
        postController = new PostController();
        List<Post> posts = new ArrayList<>();

        Mockito.when(postRepo.findAll()).thenReturn(posts);
        Mockito.when(postRepo.findById(1L)).thenReturn(java)
    }


}
