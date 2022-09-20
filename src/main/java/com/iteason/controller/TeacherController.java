package com.iteason.controller;

import com.iteason.entity.Teacher;
import com.iteason.services.TeacherService;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

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

//    @PostMapping("/likes")
//    public void batchUpdate(@RequestBody Map<String, Object> teacherMap) {
//        System.out.println(teacherMap);
////        teacherService.batchUpdate(teacherMap);
//    }
}
