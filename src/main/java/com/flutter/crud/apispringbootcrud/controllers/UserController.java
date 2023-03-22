package com.flutter.crud.apispringbootcrud.controllers;

import com.flutter.crud.apispringbootcrud.entity.User;
import com.flutter.crud.apispringbootcrud.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController

public class UserController {

    @Autowired
    private UserService userService;

    @PostMapping("/addUser")

    public User addUser(@RequestBody User user){
        return userService.saveUser(user);
    }


    @GetMapping("/users")

    public List<User> findAllUsers(){
        return userService.getUsers();
    }


    @PutMapping("/update")

    public User updateUser(@RequestBody User user){
        return userService.updateUser(user);
    }


    @DeleteMapping("/delete/{id}")

    public String deleteUser(@PathVariable int id){
        return userService.deleteUser(id);
    }



















}
