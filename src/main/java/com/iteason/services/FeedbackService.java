package com.iteason.services;

import com.iteason.dao.FeedbackDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class FeedbackService {

    @Autowired
    public FeedbackDao feedbackDao;

    public int insertFeedBack(String feedback, String date) {
        return feedbackDao.insertFeedBack(feedback, date);
    }
}
