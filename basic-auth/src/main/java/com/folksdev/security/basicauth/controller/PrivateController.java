package com.folksdev.security.basicauth.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/private")
public class PrivateController {

    @GetMapping
    public String helloWorldPrivate() {
        return "Hello World! from private endpoint";
    }

    @GetMapping("/user")
    public String helloWorldUserPrivate() {
        return "Hello World! from user private endpoint";
    }

    @GetMapping("/admin")
    public String helloWorldAdminPrivate() {
        return "Hello World! from user private endpoint";
    }


}
