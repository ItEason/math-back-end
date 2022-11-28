package com.iteason.services;

import com.iteason.dao.FeedBackDao;
import com.iteason.entity.Feedback;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FeedbackService {

    @Autowired
    private FeedBackDao feedBackDao;

    public int insertFeedBack(String feedback, String date) {
        return feedBackDao.insertFeedBack(feedback, date);
    }

    public List<Feedback> getFeedBack() {
        return feedBackDao.getFeedBack();
    }
}
