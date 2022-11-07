package com.iteason.dao;

import com.iteason.entity.Question;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface QuestionDao {

    public int insertFeedBack(String question, String date, String grade, String problem, String questioner);

    public List<Question> getProblem();
}
