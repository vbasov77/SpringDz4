package com.gb.dz4.controllers;

import com.gb.dz4.models.User;
import com.gb.dz4.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class UserController {
    @Autowired
    private UserService userService;

    @GetMapping("/")
    public String getUsers(Model model) {

        List<User> userList = userService.findAll();
        model.addAttribute("users", userList);

        return "users";
    }
}
