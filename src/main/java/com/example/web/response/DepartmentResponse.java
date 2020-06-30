package com.example.web.response;

import com.fasterxml.jackson.annotation.JsonCreator;

public class DepartmentResponse {

    private Integer id;

    private String name;

    @JsonCreator
    public DepartmentResponse(Integer id, String name) {
        this.id = id;
        this.name = name;
    }

    public Integer getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "DepartmentResponse{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
