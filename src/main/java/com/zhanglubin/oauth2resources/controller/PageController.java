package com.zhanglubin.oauth2resources.controller;

import com.zhanglubin.oauth2resources.domain.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author zhanglubin
 * @date 2021/2/20
 */
@Controller
@RequestMapping("page")
public class PageController {

    @RequestMapping("/getUser")
    @ResponseBody
    public User getUser() {
        User user = new User("aaa", "123");
        return user;
    }

    @RequestMapping("/info")
    public String info() {
        return "info";
    }
}
