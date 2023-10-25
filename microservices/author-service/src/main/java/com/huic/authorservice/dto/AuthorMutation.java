package com.huic.authorservice.dto;

import com.huic.authorservice.data.AuthorEntity;

public class AuthorMutation {
    private String name;


    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public AuthorEntity toEntity(){
        AuthorEntity entity = new AuthorEntity();
        entity.setName(name);
        return entity;
    }

}
