package com.ra.controller;

import com.ra.entity.User;
import com.ra.service.user.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/user")

public class UserController {
    @Autowired
    UserService userService;
    @GetMapping("")
    public ResponseEntity<List<User>> list(){
        List<User> list=userService.findAll();
        return new ResponseEntity<>(list, HttpStatus.OK);
    }
    @PostMapping("")
    public ResponseEntity<User> create(@RequestBody User user){
        User newUser=userService.save(user);
        return new ResponseEntity<>(user,HttpStatus.CREATED);
    }
}
