package com.vik.connectIn.posts_service.service;

import com.vik.connectIn.posts_service.dto.PostCreateRequestDto;
import com.vik.connectIn.posts_service.dto.PostDto;
import org.springframework.stereotype.Service;

@Service
public interface PostsService {
    PostDto createPost(PostCreateRequestDto postCreateRequestDto);
}

