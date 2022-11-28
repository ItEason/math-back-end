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

    public int insertFeedBack(String question, String date, String grade, String problem, String questioner, String image) {
        return questionDao.insertFeedBack(question, date, grade, problem, questioner, image);
    }

    public List<Question> getProblem() {
        return questionDao.getProblem();
    }

    public int deleteQuestion(int id) {
        return questionDao.deleteQuestion(id);
    }

    public List<Question> getQuestionById(String params) {
        return questionDao.getQuestionById(params);
    }

    public List<Question> getQuestion(String params) {
        return questionDao.getQuestion(params);
    }
}
