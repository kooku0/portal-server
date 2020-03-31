package com.doosan.ddpp.model.category.domain;

import org.springframework.boot.autoconfigure.domain.EntityScan;

public class Category {
    private String id;
    private String name;

    public Category(String id, String name) {
        this.id = id;
        this.name = name;
    }

}