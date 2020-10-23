package com.Wozu.MVCMockito.controller;

import com.Wozu.MVCMockito.model.User;
import com.Wozu.MVCMockito.service.UserService;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("/api/user")
public class userController {

    private final UserService userService;

    public userController(UserService userService){
        this.userService = userService;
    }

    //get
    @GetMapping("/get/{id}")
    public Optional<User> getUserById(@PathVariable long id){
        return userService.getUserById(id);
    }

    //save
    @PostMapping("/post")
    public void saveUser(@RequestBody User user){
        userService.saveUser(user);
    }

    //update
    @PutMapping("/put/{id}")
    public Optional<User> updateUser(@RequestBody User newUser, @PathVariable long id){
        return userService.updateUser(newUser, id);
    }

    //delete
    @DeleteMapping("/delete/{id}")
    public String deleteUser(@PathVariable Long id){
        userService.removeUser(id);
        return "User deleted";
    }
}
