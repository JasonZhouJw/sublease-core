package com.sublease.core.user.controller;

import com.sublease.common.vo.Paging;
import com.sublease.common.vo.PagingData;
import com.sublease.common.vo.RespData;
import com.sublease.core.user.domain.IUser;
import com.sublease.core.user.entities.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

/**
 * Created by jzhou237 on 2017-06-29.
 */
@RequestMapping("/user")
@Controller
public class UserController {

    @Autowired
    private IUser user;

    @GetMapping("/{id}")
    @ResponseBody
    public User findUserById(@PathVariable("id") Long id) {
        User user = new User();
        user.setId(id);
        return user;
    }

    @GetMapping("/paging")
    @ResponseBody
    public PagingData<User> paging(@RequestBody Paging paging){
        return this.user.userPaging(paging, new User());
    }

    @PostMapping("/create")
    @ResponseBody
    public RespData<User> createUser(@RequestBody User user) {
        RespData<User> respData = new RespData<>();
        respData.setData(user);
        return respData;
    }

}
