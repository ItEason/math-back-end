package com.iteason.services;

import com.iteason.dao.AnswerInfoDao;
import com.iteason.entity.AnswerInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AnswerInfoService {

    @Autowired
    private AnswerInfoDao answerInfoDao;

    public List<AnswerInfo> getInfos(String questioner) {
        return answerInfoDao.getInfos(questioner);
    }

    public int deleteAnswer(int id) {
        return answerInfoDao.deleteAnswer(id);
    }
}
