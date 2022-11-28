package com.iteason.dao;

import com.iteason.entity.Feedback;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface FeedBackDao {

    public int insertFeedBack(String feedback, String date);

    public List<Feedback> getFeedBack();
}
