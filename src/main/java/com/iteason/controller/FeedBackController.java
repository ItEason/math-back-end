package com.iteason.controller;

import com.iteason.entity.Feedback;
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
public class FeedBackController {

    @Autowired
    private FeedbackService feedbackService;

    @GetMapping("/insetFeedback")
    public int insertFeedBack(@RequestParam("feedback") String FeedBack) {

        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        Date now = new Date();

        /* 将系统时间转换为指定的格式 */
        String date = sdf.format(now);
        return feedbackService.insertFeedBack(FeedBack, date);
    }

    @GetMapping("/getFeedBack")
    public List<Feedback> getFeedBack() {
        List<Feedback> result = null;

        result = feedbackService.getFeedBack();

        return result;
    }
}
