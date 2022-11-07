package com.iteason.services;

import com.iteason.dao.QuestionDao;
import com.iteason.entity.Question;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class QuestionService {

    @Autowired
    public QuestionDao questionDao;

    public int insertFeedBack(String question, String date, String grade, String problem, String questioner) {
        return questionDao.insertFeedBack(question, date, grade, problem, questioner);
    }

    public List<Question> getProblem() {
        return questionDao.getProblem();
    }
}
