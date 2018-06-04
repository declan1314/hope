package com.declan.controller;

import com.declan.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by Administrator on 2018/6/3/003.
 */

@Controller
@RequestMapping("/user")
public class UserController {

//    @Autowired
//    private UserService userService;

    @RequestMapping("/test")
    public String test(User user, ModelMap model) {
        System.out.println(user.getUsername());
        System.out.println(user.getPassword());
        model.addAttribute(user);
        return "/return";
    }
}
