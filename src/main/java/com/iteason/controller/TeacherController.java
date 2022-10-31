package com.iteason.controller;

import com.iteason.entity.Popular;
import com.iteason.entity.Teacher;
import com.iteason.services.TeacherService;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class TeacherController {

    @Autowired
    public TeacherService teacherService;

    @GetMapping("/teacherInfo")
    public Teacher getTeacher(@Param("name") String name) {
        return teacherService.getTeacher(name);
    }

    /* 验证当前用户是否为教师接口 */
    @GetMapping("/checkTeacher")
    public String checkTeacher(@Param("username") String username) {
        Teacher teacher = null;
        teacher = teacherService.checkTeacher(username);
        if (teacher == null) {
            return "false";
        }
        return "true";
    }
}
