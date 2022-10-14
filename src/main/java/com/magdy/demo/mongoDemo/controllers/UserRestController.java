package com.magdy.demo.mongoDemo.controllers;

import com.magdy.demo.mongoDemo.entities.UserResponse;
import com.magdy.demo.mongoDemo.services.UserServices;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/api/v1/user")
@RestController
public class UserRestController {

    public UserServices userServices;

    public UserRestController(UserServices userServices) {
        this.userServices = userServices;
    }

    @GetMapping
    public UserResponse getUser(@RequestParam Integer id){
       return userServices.getUserById(id);
    }
}
