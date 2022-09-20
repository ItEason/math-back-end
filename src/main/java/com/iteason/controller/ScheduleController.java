package com.iteason.controller;

import com.iteason.entity.Schedule;
import com.iteason.services.ScheduleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class ScheduleController {
    @Autowired //注入service对象
    private ScheduleService scheduleService;

    /* 教师答疑排班接口 */
    @GetMapping("/teacher") //仅限get请求 路径为 test
    public List<Schedule> test(@RequestParam("day") String day) {
        /* 执行获取数据方法，读取数据库中的schedule表中的数据 */
        return scheduleService.getTeacher(day);
    }

}
