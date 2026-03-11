package com.example.Project4.controller;

import org.springframework.web.bind.annotation.*;

import com.example.Project4.dto.request.CustomerRequest;
import com.example.Project4.dto.response.CustomerResponse;
import com.example.Project4.entity.Customer;
import com.example.Project4.repository.CustomerRepository;
import com.example.Project4.service.CustomerService;

import java.util.List;

@RestController
@RequestMapping("/process")
public class CustomerController {

    private final CustomerService customerService;
    private final CustomerRepository customerRepository;

    public CustomerController(CustomerService customerService,
                              CustomerRepository customerRepository) {
        this.customerService = customerService;
        this.customerRepository = customerRepository;
    }

   
    @PostMapping("/customer")
    public CustomerResponse processCustomer(@RequestBody CustomerRequest request) {
        return customerService.processCustomer(request);
    }

    
    @GetMapping("/customers")
    public List<Customer> getAllCustomers() {
        return customerRepository.findAll();
    }
}