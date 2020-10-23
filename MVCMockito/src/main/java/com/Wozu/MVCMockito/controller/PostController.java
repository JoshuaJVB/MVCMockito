package com.Wozu.MVCMockito.controller;

import com.Wozu.MVCMockito.model.Post;
import com.Wozu.MVCMockito.service.PostServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api")
public class PostController {

    @Autowired
    PostServiceImpl postServiceImpl;

    @GetMapping("/get/post/{id}")
    public Optional<Post> getPostByID(@PathVariable Long id){
        return postServiceImpl.getPostById(id);
    }

    @GetMapping("/get/post/{userID}")
    public Optional<Post> getPostByUserID(@PathVariable Long userID){
        return postServiceImpl.getPostByUserID(userID);
    }

    @PostMapping("/post/post")
    public String savePost(@RequestBody Post post){
        postServiceImpl.savePost(post);
        return "post saved";
    }

    @DeleteMapping("/delete/post/{id}")
    public String deletePost(@PathVariable Long id){
        postServiceImpl.removePost(id);
        return "post deleted";
    }


}
