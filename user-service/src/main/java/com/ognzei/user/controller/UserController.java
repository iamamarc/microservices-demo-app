package com.ognzei.user.controller;

import com.ognzei.user.VO.ResponseTemplateVO;
import com.ognzei.user.entity.User;
import com.ognzei.user.service.UserService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/users")
@Slf4j
public class UserController {

    @Autowired
    private UserService userService;

    @PostMapping("/")
    public User saveDepartment(@RequestBody User user){
        log.info("Inside the saveUser method of UserController");
        return userService.saveUser(user);
    }

    @GetMapping("/{Id}")
    public ResponseTemplateVO getUserWithDepartment(@PathVariable("Id") Long userId){
        log.info("Inside getUserWithDepartment of UserController");
        return userService.getUserWithDepartment(userId);
    }
}
