package com.CASIC.controller;

import com.CASIC.domain.User;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Description: user
 * @Author: boyue
 * @CreateDate: 2019/11/23 12:07
 * @Version: 1.0
 **/
@RestController
public class UserController {

    @RequestMapping("/getUser")
    public User getUser(){
        User user=new User("34","boyue","666");
        return user;
    }
}
