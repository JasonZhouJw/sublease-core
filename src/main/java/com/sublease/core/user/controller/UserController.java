package com.sublease.core.user.controller;

import com.sublease.core.user.entities.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

/**
 * Created by jzhou237 on 2017-06-29.
 */
@RequestMapping("/user")
@Controller
public class UserController {

    @GetMapping("/{id}")
    @ResponseBody
    public User findUserById(@PathVariable("id") Long id) {
        User user = new User();
        user.setId(id);
        return user;
    }
}
