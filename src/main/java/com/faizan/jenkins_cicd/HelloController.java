package com.faizan.jenkins_cicd;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @GetMapping("/")
    public String home() {
        return "🚀 CI/CD Pipeline V2 Successfully Deployed on EC2 using Jenkins & Docker!";
    }
}
