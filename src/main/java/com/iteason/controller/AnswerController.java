package com.iteason.controller;

import com.iteason.services.AnswerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class AnswerController {

    @Autowired
    private AnswerService answerService;

    @GetMapping("/addAnswer")
    public int insertAnswer(@RequestParam("content") String content, @RequestParam("answerer") String answerer, @RequestParam("image") String image, @RequestParam("qid") int qid) {
        return answerService.insertAnswer(content, answerer, image, qid);
    }
}
