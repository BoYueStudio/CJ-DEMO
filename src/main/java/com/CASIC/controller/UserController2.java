package com.CASIC.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @Description:
 * @Author: boyue
 * @CreateDate: 2019/11/23 13:10
 * @Version: 1.0
 **/
@Controller
public class UserController2 {

    @RequestMapping("/getIndex")
    public String getIndex(){
        return "index";
    }
}
