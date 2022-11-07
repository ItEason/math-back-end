package com.iteason.controller;


import com.iteason.entity.Activity;
import com.iteason.entity.Question;
import com.iteason.services.ActivityService;
import com.iteason.services.QuestionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

@RestController
@RequestMapping("/api")
public class ActivityController {

    @Autowired
    private ActivityService activityService;

    /* home页面获取线下活动接口 */
    @GetMapping("/activity")
    public List<Activity> getAll() {
        return activityService.getActivity();
    }

    @Autowired
    private QuestionService questionService;

    /* 用户反馈接口 */
    @GetMapping("/question")
    public int insertFeedBack(@RequestParam("question") String question, @RequestParam("grade") String grade, @RequestParam("problem") String problem, @RequestParam("questioner") String questioner) {
        /* 设置对应的日期样式 */
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy年MM月dd日 HH:mm:ss");
        Date now = new Date();

        /* 将系统时间转换为指定的格式 */
        String date = sdf.format(now);

        /* 执行对应的方法，question */
        return questionService.insertFeedBack(question, date, grade, problem, questioner);
    }

    @GetMapping("/getProblems")
    public List<Question> getProblem() {
        return questionService.getProblem();
    }
}
