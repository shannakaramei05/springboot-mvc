package com.example.learnmvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@Controller
public class SampleController {

    @GetMapping("/")
    public String showHomePage() {
        return "sample";
    }
}
