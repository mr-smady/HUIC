package com.huic.graphqlservice.books;


public class BookMutation {

    private String title;
    private Long authorId;

    public BookMutation() {
    }

    public BookMutation(Long id, String title, Long authorId) {
        this.title = title;
        this.authorId = authorId;
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

    @Override
    public String toString() {
        return String.format("title: %s, authorId: %d", title, authorId);
    }
}