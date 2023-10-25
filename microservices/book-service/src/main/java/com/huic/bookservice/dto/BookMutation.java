package com.huic.bookservice.dto;

import com.huic.bookservice.data.BookEntity;

public class BookMutation {

    private String title;
    private Long authorId;


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

    public BookEntity toEntity() {
        BookEntity entity = new BookEntity();
        entity.setTitle(title);
        entity.setAuthorId(authorId);
        return entity;
    }

    @Override
    public String toString() {
        return String.format("title: %s, authorId: %d", title, authorId);
    }
}
