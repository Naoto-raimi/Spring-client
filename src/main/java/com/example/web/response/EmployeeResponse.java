package com.example.web.response;

import java.time.LocalDate;

public class EmployeeResponse {

    private Integer id;

    private String name;

    private LocalDate joinedDate;

    private DepartmentResponse department;

    public EmployeeResponse(Integer id, String name, LocalDate joinedDate, DepartmentResponse department) {
        this.id = id;
        this.name = name;
        this.joinedDate = joinedDate;
        this.department = department;
    }

    public Integer getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public LocalDate getJoinedDate() {
        return joinedDate;
    }

    public DepartmentResponse getDepartment() {
        return department;
    }

    @Override
    public String toString() {
        return "EmployeeResponse{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", joinedDate=" + joinedDate +
                ", department=" + department +
                '}';
    }
}
