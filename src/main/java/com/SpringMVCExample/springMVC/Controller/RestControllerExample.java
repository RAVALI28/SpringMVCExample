package com.SpringMVCExample.springMVC.Controller;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
public class RestControllerExample {

    @GetMapping("/greet/{name}")
    public String greet(@PathVariable String name) {

        return "Hello, " + name + "!";
    }
}
