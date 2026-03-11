package com.example.Project4.dto.response;

import java.util.List;

public class CustomerResponse {

    private Long id;
    private String name;
    private List<String> productname;
    private double total;
    private double gst;
    private double grandTotal;

    public CustomerResponse() {
    }

    public CustomerResponse(Long id, String name, List<String> productname,
                            double total, double gst, double grandTotal) {
        this.id = id;
        this.name = name;
        this.productname = productname;
        this.total = total;
        this.gst = gst;
        this.grandTotal = grandTotal;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

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

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }

    public double getGst() {
        return gst;
    }

    public void setGst(double gst) {
        this.gst = gst;
    }

    public double getGrandTotal() {
        return grandTotal;
    }

    public void setGrandTotal(double grandTotal) {
        this.grandTotal = grandTotal;
    }
}