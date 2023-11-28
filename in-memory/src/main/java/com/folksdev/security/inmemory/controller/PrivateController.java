package com.folksdev.security.inmemory.controller;


import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/mahmut")
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
