package com.example.web.request;

import com.fasterxml.jackson.annotation.JsonCreator;

public class DepartmentRequest {
    private Integer id;

    @JsonCreator
    public DepartmentRequest(Integer id){
        this.id = id;
    }

    public Integer getId() {
        return id;
    }

    @Override
    public String toString() {
        return "DepartmentRequest{" +
                "id=" + id +
                '}';
    }
}

