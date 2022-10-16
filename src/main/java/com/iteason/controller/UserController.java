package com.iteason.controller;


import com.iteason.entity.User;
import com.iteason.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api")
public class UserController {

    @Autowired
    public UserService userService;

    /* 验证用户登录接口 */
    @PostMapping("/user")
    public String getUser(@RequestParam("username") String username, @RequestParam("password") String password) {
        /* 执行mapper层中sql语句，接收对应的结果集 */
        User user = userService.getUser(username);
        if (user == null) {
            /* 数据库查询没有该用户时接口返回的数据 */
            return "user_err";
        } else if (password.equals(user.getPassword()) == false) {
            /* 数据库查询存在该用户但是密码错误接口返回的数据 */
            return "psw_err";
        } else {
            /* 用户存在且密码正确时接口返回的数据 */
            return user.getImgSrc();
        }
    }

    /* 添加新用户接口 */
    @PostMapping("/insertUser")
    public String insertUser(@RequestParam("username") String username, @RequestParam("password") String password, @RequestParam("img_url") String img_url) {
        int i = userService.insertUser(username, password, img_url);
        if (i == 0) {
            return "false";
        }
        return "success";
    }

    /* 验证新用户名是否已存在接口 */
    @PostMapping("/cUsername")
    public String checkUsername(@RequestParam("username") String username) {
        User user = userService.getUser(username);
        if (user != null) {
            return "exists";
        }
        return "no-exists";
    }

    /* 获取所有用户信息接口 */
    @GetMapping("/getUsers")
    public List<User> selectUsers() {
        List<User> list = userService.selectUsers();
        return list;
    }
}
