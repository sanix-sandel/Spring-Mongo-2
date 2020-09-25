package com.sanix.springmongo.domain;

import org.springframework.data.annotation.Id;

public class User {

    @Id
    private String id;

    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
