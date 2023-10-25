package com.huic.authorservice.dto;

import com.huic.authorservice.data.AuthorEntity;

public class Author {
    private Long id;
    private String name;

    public Author(AuthorEntity entity) {
        this.id = entity.getId();
        this.name = entity.getName();
    }


    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }
}
