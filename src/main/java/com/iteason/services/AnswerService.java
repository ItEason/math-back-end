package com.iteason.services;

import com.iteason.dao.AnswerDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AnswerService {

    @Autowired
    private AnswerDao answerDao;

    public int insertAnswer(String content, String answerer, String image, int qid) {
        return answerDao.insertAnswer(content, answerer, image, qid);
    }
}
