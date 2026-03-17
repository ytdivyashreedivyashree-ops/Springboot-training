package com.example.Addition.controller;

// import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.Addition.dto.AddRequest;
import com.example.Addition.dto.AddResponse;
import com.example.Addition.response.ApiResponse;
import com.example.Addition.service.AddService;

@RestController
@RequestMapping("/addition")
public class AddController {
    private final AddService addService;

    public AddController(AddService addService) {
        this.addService = addService;
    }
    
    @PostMapping("/add")
    public ApiResponse<AddResponse> getDetails(@RequestBody AddRequest req)
    {
        AddResponse response=addService.calculate(req);
        return new ApiResponse<AddResponse>("Success",response);
    }

    //  @GetMapping("/adds")
    // public ApiResponse<AddResponse> getDetails(@PathVariable Integer c)
    // {
    //     AddResponse response=addService.calculate(req);
    //     return new ApiResponse<AddResponse>("Success",response);
    // }

}
