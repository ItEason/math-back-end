package com.iteason.controller;

import com.iteason.entity.Teacher;
import com.iteason.services.TeacherService;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

@RestController
@RequestMapping("/api")
public class TeacherController {

    @Autowired
    public TeacherService teacherService;

    /* 获取最受欢迎教师接口 */
    @GetMapping("/popular")
    public List<Teacher> getAllPopular() {
        return teacherService.getAllPopular();
    }

    /* 更新最受欢迎老师接口 */
    @GetMapping("/likes")
    public String batchUpdate(@Param("tID") String tID, @Param("total") Integer total) {
        teacherService.batchUpdate(tID, total);
        return "ok";
    }
}
