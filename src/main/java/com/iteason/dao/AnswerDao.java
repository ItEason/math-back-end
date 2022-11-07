package com.iteason.dao;

import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface AnswerDao {

    public int insertAnswer(String content, String answerer, String image, int qid);
}
