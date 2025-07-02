package com.dh.book.springboot.service.posts;

import com.dh.book.springboot.domain.posts.Posts;
import com.dh.book.springboot.domain.posts.PostsRepository;
import com.dh.book.springboot.web.dto.PostsSaveRequestDto;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@RequiredArgsConstructor
@Service
public class PostsService {

    private final PostsRepository postsRepository;

    @Transactional
    public Long save(PostsSaveRequestDto requestDto) {
        Posts entity = requestDto.toEntity();
        return postsRepository.save(entity).getId();
    }
}
