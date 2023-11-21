package com.Yeon_chae.book.springboot.web;

import com.Yeon_chae.book.springboot.service.posts.PostsService;
import com.Yeon_chae.book.springboot.web.dto.PostsListResponseDto;
import com.Yeon_chae.book.springboot.web.dto.PostsResponseDto;
import com.Yeon_chae.book.springboot.web.dto.PostsSaveRequestDto;
import com.Yeon_chae.book.springboot.web.dto.PostsUpdateRequestDto;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RequiredArgsConstructor
@RequestMapping("/api/v1/posts")
@RestController
public class PostsApiController {

    private final PostsService postsService;

    @PostMapping
    public Long save(@RequestBody @Valid PostsSaveRequestDto requestDto) {
        return postsService.save(requestDto);
    }

    @GetMapping
    public List<PostsListResponseDto> getPostsList(){
        return postsService.findAllDesc();
    }

    @PutMapping("/{id}")
    public Long update(@PathVariable Long id, @RequestBody PostsUpdateRequestDto requestDto) {
        return postsService.update(id, requestDto);
    }

    @DeleteMapping("/{id}")
    public Long delete(@PathVariable Long id) {
        postsService.delete(id);
        return id;
    }

}