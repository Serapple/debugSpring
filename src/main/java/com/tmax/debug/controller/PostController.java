package com.tmax.debug.controller;


import com.tmax.debug.entity.Post;
import com.tmax.debug.repository.PostRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
public class PostController {
    @Autowired
    private PostRepository postRepository;

    @GetMapping("/posts")
    public List<Post> getAllPosts(){
        return postRepository.findAll();
    }

    @GetMapping("/posts/{id}")
    public Optional<Post> getPostById(Long id){
        return postRepository.findById(id);
    }
}
