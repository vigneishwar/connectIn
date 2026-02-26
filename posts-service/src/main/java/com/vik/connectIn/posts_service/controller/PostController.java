package com.vik.connectIn.posts_service.controller;


import com.vik.connectIn.posts_service.dto.PostCreateRequestDto;
import com.vik.connectIn.posts_service.dto.PostDto;
import com.vik.connectIn.posts_service.service.PostsService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/core")
@RequiredArgsConstructor
public class PostController {

    private final PostsService postsService;

    @PostMapping
    public ResponseEntity<PostDto> createPost(@RequestBody PostCreateRequestDto postCreateRequestDto) {
        PostDto createdPost = postsService.createPost(postCreateRequestDto);
        return ResponseEntity.ok(createdPost);
    }
}
