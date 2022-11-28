package com.iteason.controller;

import com.iteason.entity.AnswerInfo;
import com.iteason.services.AnswerInfoService;
import com.iteason.services.AnswerService;
import com.iteason.services.QuestionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api")
public class AnswerController {

    @Autowired
    private AnswerService answerService;

    @GetMapping("/addAnswer")
    public int insertAnswer(@RequestParam("content") String content, @RequestParam("answerer") String answerer, @RequestParam("image") String image, @RequestParam("qid") int qid) {
        return answerService.insertAnswer(content, answerer, image, qid);
    }

    @Autowired
    private AnswerInfoService answerInfoService;

    @GetMapping("/getInfos")
    public List<AnswerInfo> getInfos(@RequestParam("questioner") String questioner) {
        List<AnswerInfo> result = null;
        result = answerInfoService.getInfos(questioner);
        return result;
    }

    @GetMapping("/deleteAnswer")
    public int deleteAnswer(@RequestParam("id") int id) {
        return answerInfoService.deleteAnswer(id);
    }

    @Autowired
    private QuestionService questionService;

    @GetMapping("/deleteQuestion")
    public int deleteQuestion(@RequestParam("id") int id) {
        return questionService.deleteQuestion(id);
    }
}
