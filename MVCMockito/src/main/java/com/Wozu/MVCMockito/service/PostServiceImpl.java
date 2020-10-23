package com.Wozu.MVCMockito.service;

import com.Wozu.MVCMockito.model.Post;
import com.Wozu.MVCMockito.repo.PostRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PostServiceImpl implements PostService{

    @Autowired
    PostRepo postRepo;

    @Override
    public Optional<Post> getPostById(Long id) {
        return postRepo.findById(id);
    }

    @Override
    public Optional<Post> getPostByUserID(Long userID) {
        return postRepo.findById(userID);
    }

    @Override
    public Iterable<Post> getAllPosts() {
        return postRepo.findAll();
    }

    @Override
    public void savePost(Post post) {
        postRepo.save(post);
    }

    @Override
    public void removePost(Long id) {
        postRepo.deleteById(id);
    }
}
