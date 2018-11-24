package com.qfedu.controller;

import com.qfedu.pojo.User;
import com.qfedu.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class UserController {
    @Autowired
    private UserService service;
@RequestMapping("/loginUser")
    public String loginuser(User user) {
    User user1 = service.login(user);
    if (user1==null) {
        return "redirect:userlogin.html";
    }
    return "redirect:goods.html";
    }
}

