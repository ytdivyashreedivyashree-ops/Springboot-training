package com.example.Project2.dto.response;

public class BillResponse {
    private String productName;
    private int totalPrice;
    private int netPrice;


    public BillResponse(String productName, int totalPrice,int netPrice) {
        this.productName = productName;
        this.totalPrice = totalPrice;
        this.netPrice = netPrice;
    }


    public String getProductName() {
        return productName;
    }


    public void setProductName(String productName) {
        this.productName = productName;
    }


    public int getTotalPrice() {
        return totalPrice;
    }


    public void setTotalPrice(int totalPrice) {
        this.totalPrice = totalPrice;
    }


    public int getNetPrice() {
        return netPrice;
    }


    public void setNetPrice(int netPrice) {
        this.netPrice = netPrice;
    }

   


    
}
