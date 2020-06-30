package com.example.web.request;

import com.fasterxml.jackson.annotation.JsonCreator;

import java.time.LocalDate;

public class EmployeeRequest {
    private String name;
    private LocalDate joinedDate;
    private DepartmentRequest department;

    @JsonCreator
    public EmployeeRequest(String name, LocalDate joinedDate, Integer departmentId){
        this.name = name;
        this.joinedDate = joinedDate;
        this.department = new DepartmentRequest(departmentId);
    }

    public String getName() {
        return name;
    }

    public LocalDate getJoinedDate() {
        return joinedDate;
    }

    public DepartmentRequest getDepartment() {
        return department;
    }

    @Override
    public String toString() {
        return "EmployeeRequest{" +
                "name='" + name + '\'' +
                ", joinedDate=" + joinedDate +
                ", department=" + department +
                '}';
    }
}
