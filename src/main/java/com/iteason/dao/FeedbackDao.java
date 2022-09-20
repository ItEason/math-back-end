package com.iteason.dao;

import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface FeedbackDao {

    public int insertFeedBack(String feedback, String date);
}
