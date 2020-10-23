package com.Wozu.MVCMockito.service;

import com.Wozu.MVCMockito.model.Post;

import java.util.List;
import java.util.Optional;

public interface PostService {
    Optional<Post> getPostById(Long id);
    Optional<Post> getPostByUserID(Long userID);
    Iterable<Post> getAllPosts();
    void savePost(Post post);
    void removePost(Long id);
}
