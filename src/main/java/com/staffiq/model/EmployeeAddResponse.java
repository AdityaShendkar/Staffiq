package com.staffiq.model;

public class EmployeeAddResponse {
    private long id;
    private String name;

    public EmployeeAddResponse() {
    }

    public EmployeeAddResponse(long id, String name) {
        this.id = id;
        this.name = name;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
