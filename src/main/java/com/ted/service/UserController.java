package com.ted.service;

import com.ted.demo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class UserController {
    @Autowired
    private UserService userService;

    @RequestMapping("/user")
    public String userDetail(Model model,Integer id){
        User user=userService.queryUserBuId(id);
        model.addAttribute("user",user);
        return "userDetail";
    }
}
