package com.sublease.core.user.controller;


import com.sublease.common.vo.Message;
import com.sublease.core.user.domain.AuthenticationResult;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;


/**
 * Created by jzhou237 on 2016-12-06.
 */
@Controller
public class SessionController {

    @GetMapping("/login")
    @ResponseBody
    public Message<String> login(@ModelAttribute AuthenticationResult authenticationResult) {
        return new Message<String>(authenticationResult.getMessage());
    }

    @PostMapping("/logout")
    public ModelAndView logout(@ModelAttribute AuthenticationResult authenticationResult) {
        return new ModelAndView();
    }
}
