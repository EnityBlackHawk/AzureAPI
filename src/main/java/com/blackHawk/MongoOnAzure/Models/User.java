package com.blackHawk.MongoOnAzure.Models;

import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.MongoId;

import javax.annotation.processing.Generated;

public class User {

    @MongoId
    private String id;

    private String name;

    public User() {
    }


    public User(String name) {
        this.name = name;
    }

    public User(String id, String name) {
        this.id = id;
        this.name = name;
    }


    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
