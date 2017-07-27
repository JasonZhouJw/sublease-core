package com.sublease.core.user.controller;


import com.sublease.common.vo.RespData;
import com.sublease.core.user.domain.AuthenticationResult;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;


/**
 * Created by jzhou237 on 2016-12-06.
 */
@Controller
public class SessionController {

    @PostMapping("/login")
    @ResponseBody
    public String login(@ModelAttribute AuthenticationResult authenticationResult) {
        return authenticationResult.getMessage();
    }

    @PostMapping("/logout")
    public ModelAndView logout(@ModelAttribute AuthenticationResult authenticationResult) {
        return new ModelAndView();
    }
}
