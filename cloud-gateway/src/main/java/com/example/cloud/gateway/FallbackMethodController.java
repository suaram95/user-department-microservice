package com.example.cloud.gateway;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FallbackMethodController {

    @GetMapping("/userServiceFallBack")
    public String userServiceFallbackMethod() {
        return "User service is taking longer than Expected."
                + " Please try again later";
    }

    @GetMapping("/departmentServiceFallBack")
    public String departmentServiceFallbackMethod() {
        return "Department service is taking longer than Expected."
                + " Please try again later";
    }
}
