package com.example.sportstats;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

 //marks SportsApplication class as a request handler
@SpringBootApplication
@RestController
public class SportsApplication {

    public static void main(String[] args) {
        SpringApplication.run(SportsApplication.class, args);
    }

    @GetMapping("/basketball") // maps method to GET requests for /hello
    public String sayHello(@RequestParam(value = "sportSelection", defaultValue = "World") String sport){ //@RequestParam maps the name method to the myName web request parameter
        return String.format("Welcome to the %s Statistics Page!", sport);
    }


}


