package com.example.springcloudeureka.controller;


import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/second-service")
@Slf4j
public class SecondServiceController {

    @GetMapping("/welcome")
    public String welcome() {
        return "Welcome to the Second service";
    }

    @GetMapping("/message")

    public String message(@RequestHeader("secondrequest") String header){
        log.info(header);
        return  "Hellow World in First Service";
    }
}
