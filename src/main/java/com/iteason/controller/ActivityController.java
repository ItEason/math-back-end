package com.iteason.controller;


import com.iteason.entity.Activity;
import com.iteason.services.ActivityService;
import com.iteason.services.FeedbackService;
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
    private FeedbackService feedbackService;

    /* 用户反馈接口 */
    @GetMapping("/feedback")
    public int insertFeedBack(@RequestParam("feedback") String feedback) {
        /* 设置对应的日期样式 */
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy年MM月dd日 HH:mm:ss");
        Date now = new Date();

        /* 将系统时间转换为指定的格式 */
        String date = sdf.format(now);

        /* 执行对应的方法，将数据更新到数据库中的feedback表中 */
        return feedbackService.insertFeedBack(feedback, date);
    }
}
