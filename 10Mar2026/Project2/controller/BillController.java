package com.example.Project2.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.Project2.dto.request.Billrequest;
import com.example.Project2.dto.response.Apiresponse;
import com.example.Project2.dto.response.BillResponse;
import com.example.Project2.service.BillService;

@RestController
@RequestMapping("/bill")
public class BillController {
   private final BillService billService;

    public BillController(BillService billService) {
        this.billService = billService;
    }

    @PostMapping("/calculate")
    public Apiresponse getResult(@RequestBody Billrequest request)
    {
        BillResponse billResponse=billService.caBillResponse(request);
        return new Apiresponse("Bill calculated successfully", billResponse);
    }
    
    
}
