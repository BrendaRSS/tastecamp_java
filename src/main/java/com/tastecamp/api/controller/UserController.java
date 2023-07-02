package com.tastecamp.api.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.tastecamp.api.dto.UserDTO;

@RestController
@RequestMapping("/")
public class UserController {

    @GetMapping
    public String userGet(){
        return "Hello, user";
    }

    @PostMapping
    public void userCreate(@RequestBody UserDTO req){
        System.out.println(req.name());
        System.out.println(req.email());
    }
}
