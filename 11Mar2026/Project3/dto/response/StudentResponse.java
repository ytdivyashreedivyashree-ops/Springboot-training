package com.example.Project3.dto.response;

public class StudentResponse {
    private String name;
    private int rollno;
    private int total;
    private double percentage;
    private String results;
    public StudentResponse(String name, int rollno, int total, double percentage, String results) {
        this.name = name;
        this.rollno = rollno;
        this.total = total;
        this.percentage = percentage;
        this.results = results;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getRollno() {
        return rollno;
    }
    public void setRollno(int rollno) {
        this.rollno = rollno;
    }
    public int getTotal() {
        return total;
    }
    public void setTotal(int total) {
        this.total = total;
    }
    public double getPercentage() {
        return percentage;
    }
    public void setPercentage(double percentage) {
        this.percentage = percentage;
    }
    public String getResults() {
        return results;
    }
    public void setResults(String results) {
        this.results = results;
    }

    
}
