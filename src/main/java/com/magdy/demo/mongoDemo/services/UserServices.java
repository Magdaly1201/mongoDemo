package com.magdy.demo.mongoDemo.services;

import com.magdy.demo.mongoDemo.entities.User;
import com.magdy.demo.mongoDemo.entities.UserResponse;
import com.magdy.demo.mongoDemo.repositories.UserRepository;
import org.springframework.stereotype.Service;

@Service
public class UserServices {
    private final UserRepository userRepository;

    public UserServices(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public UserResponse getUserById(Integer id) {
       User user = userRepository.findById(id).orElseThrow(()->new RuntimeException("not found"));
       return new UserResponse(user.getName(),user.getMail());
    }
}
