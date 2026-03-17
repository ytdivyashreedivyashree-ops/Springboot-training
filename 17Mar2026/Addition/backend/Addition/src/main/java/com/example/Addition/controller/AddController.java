package com.example.Addition.controller;

import java.util.List;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
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
@CrossOrigin(origins = "http://localhost:5173")
public class AddController {

    private final AddService addService;

    public AddController(AddService addService) {
        this.addService = addService;
    }

    @PostMapping
    public ApiResponse<AddResponse> getAdditionResult(@RequestBody AddRequest req) {
        AddResponse response = addService.calculate(req);
        return new ApiResponse<>("Success", response);
    }

    @GetMapping
    public ApiResponse<List<AddResponse>> getEveryAddition() {
        List<AddResponse> responses = addService.getEveryAddition();
        return new ApiResponse<>("Success", responses);
    }
}