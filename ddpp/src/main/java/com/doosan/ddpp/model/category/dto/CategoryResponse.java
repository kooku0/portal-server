package com.doosan.ddpp.model.category.dto;

import java.util.Objects;

public class CategoryResponse {
    private String id;
    private String name;

    public CategoryResponse() {}
    public CategoryResponse(String id, String name) {
        this.id = id;
        this.name = name;
    }
}