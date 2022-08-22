package com.example.harmony.domain.community.dto;

import lombok.Getter;
import lombok.ToString;

import java.util.List;

@ToString
@Getter
public class PostRequest {

    private String title;

    private String category;

    private String content;

    private List<String> tags;

    public PostRequest(String title, String category, String content, List<String> tags) {
        this.title = title;
        this.category = category;
        this.content = content;
        this.tags = tags;
    }

}
