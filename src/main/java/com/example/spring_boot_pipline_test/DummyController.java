package com.example.spring_boot_pipline_test;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DummyController {
    @GetMapping("/dummy")
    public String getDummy() {
        return "This is a dummy response.";
    }
}

