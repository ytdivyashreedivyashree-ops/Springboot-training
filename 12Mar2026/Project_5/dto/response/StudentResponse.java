package com.example.Project_5.dto.response;

public class StudentResponse {
    private long id;
    private String name;
    private String registerNumber;


    public StudentResponse(long id, String name, String registerNumber) {
        this.id = id;
        this.name = name;
        this.registerNumber = registerNumber;
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

    public String getRegisterNumber() {
        return registerNumber;
    }

    public void setRegisterNumber(String registerNumber) {
        this.registerNumber = registerNumber;
    }
    
}
