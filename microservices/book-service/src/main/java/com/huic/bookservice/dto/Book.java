package com.huic.bookservice.dto;

import com.huic.bookservice.data.BookEntity;

public class Book {
    private Long id;
    private String title;
    private Long authorId;

    public Book(BookEntity entity) {
        this.id = entity.getId();
        this.title = entity.getTitle();
        this.authorId = entity.getAuthorId();
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setAuthorId(Long authorId) {
        this.authorId = authorId;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Long getAuthorId() {
        return authorId;
    }

    public String getTitle() {
        return title;
    }
}
