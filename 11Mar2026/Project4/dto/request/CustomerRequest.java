package com.example.Project4.dto.request;

import java.util.List;

public class CustomerRequest {
    private String name;
    private List<String> productname;
    private List<Double> productprice;

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public List<String> getProductname() {
        return productname;
    }
    public void setProductname(List<String> productname) {
        this.productname = productname;
    }
    public List<Double> getProductprice() {
        return productprice;
    }
    public void setProductprice(List<Double> productprice) {
        this.productprice = productprice;
    }
}