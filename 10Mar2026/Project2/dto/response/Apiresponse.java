package com.example.Project2.dto.response;

public class Apiresponse {
    private String message;
    private BillResponse billResponse;

    public Apiresponse(String message, BillResponse billResponse) {
        this.message = message;
        this.billResponse = billResponse;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public BillResponse getBillResponse() {
        return billResponse;
    }

    public void setBillResponse(BillResponse billResponse) {
        this.billResponse = billResponse;
    }
    
    
}
