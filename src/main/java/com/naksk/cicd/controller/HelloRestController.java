package com.naksk.cicd.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
public class HelloRestController {

    @GetMapping("/hello")
    public String hello() {
        String message = "hello cicd";
        log.info("hello = {}", message);
        return message;
    }
}
