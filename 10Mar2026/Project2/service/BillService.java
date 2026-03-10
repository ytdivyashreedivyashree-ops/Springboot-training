package com.example.Project2.service;

import org.springframework.stereotype.Service;

import com.example.Project2.dto.request.Billrequest;
import com.example.Project2.dto.response.BillResponse;

@Service
public class BillService {
    public BillResponse caBillResponse(Billrequest req)
    {
        int totalPrice=0;
        totalPrice=req.getPrice1()+req.getPrice2()+req.getPrice3()+req.getPrice4()+req.getPrice5()
        +req.getPrice6()+req.getPrice7()+req.getPrice8()+req.getPrice9()+req.getPrice10();
        int result=totalPrice*18/100;
        int netPrice=totalPrice-result;
        return new BillResponse(req.getProductName(),totalPrice, netPrice);
    }
    
}
