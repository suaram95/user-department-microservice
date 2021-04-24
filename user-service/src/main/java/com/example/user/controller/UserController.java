package com.example.user.controller;

import com.example.user.VO.RestTemplateVO;
import com.example.user.entity.User;
import com.example.user.service.UserServiceImpl;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

@RestController
@RequiredArgsConstructor
@Slf4j
@RequestMapping("/users")
public class UserController {

    private final UserServiceImpl userService;

    @PostMapping("/")
    public User saveUser(@RequestBody User user){
        log.info("Inside method saveUser if UserController");
        return userService.saveUser(user);
    }

    @GetMapping("/{id}")
    public RestTemplateVO getUserWithDepartment(@PathVariable("id") int userId){
        log.info("Inside method getUserWithDepartment if UserController");
        return userService.getUserWithDepartment(userId);
    }


}
