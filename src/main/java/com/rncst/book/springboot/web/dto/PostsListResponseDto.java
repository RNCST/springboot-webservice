package com.rncst.book.springboot.web.dto;

import com.rncst.book.springboot.domain.posts.Posts;
import lombok.Getter;
import java.time.LocalDateTime;

@Getter
public class PostsListResponseDto {
    private Long id;
    private String title;
    private String author;
    private LocalDateTime modifiedData;

    public PostsListResponseDto(Posts entity) {
        this.id = entity.getId();
        this.title = entity.getTitle();
        this.author =  entity.getAuthor();
        this.modifiedData =entity.getModifiedData();
    }
}
