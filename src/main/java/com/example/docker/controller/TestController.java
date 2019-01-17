package com.example.docker.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author xyd on 2019/1/17.
 */
@RestController("/test")
public class TestController {

    @GetMapping("/")
    public String test() {
        return "docker hello!";
    }
}
