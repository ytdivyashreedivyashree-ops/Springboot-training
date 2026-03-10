package com.example.demo;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Student {

    public int m1, m2, m3, m4, m5;

    @PostMapping("/marks")
    public int totalMarks(@RequestBody Student s) {
        return s.m1 + s.m2 + s.m3 + s.m4 + s.m5;
    }

     @PostMapping("/average")
    public String averageMarks(@RequestBody Student s) {

        int avg = (s.m1 + s.m2 + s.m3 + s.m4 + s.m5) / 5;

        if(avg >= 75) {
            return "Average = " + avg + " Eligible";
        } else {
            return "Average = " + avg + " Not Eligible";
        }
    }
}