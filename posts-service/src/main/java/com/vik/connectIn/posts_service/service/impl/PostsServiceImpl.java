package com.vik.connectIn.posts_service.service.impl;

import com.vik.connectIn.posts_service.dto.PostCreateRequestDto;
import com.vik.connectIn.posts_service.dto.PostDto;
import com.vik.connectIn.posts_service.repository.PostsRepository;
import com.vik.connectIn.posts_service.service.PostsService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Service
@Slf4j
@RequiredArgsConstructor
public class PostsServiceImpl implements PostsService {

    private final PostsRepository postsRepository;

    @Override
    public PostDto createPost(PostCreateRequestDto postCreateRequestDto) {
        return null;
    }
}
