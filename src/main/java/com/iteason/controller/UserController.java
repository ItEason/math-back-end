package com.iteason.controller;


import com.iteason.entity.User;
import com.iteason.services.UserService;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

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
}
