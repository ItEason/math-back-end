package com.iteason.dao;

import com.iteason.entity.AnswerInfo;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface AnswerInfoDao {

    public List<AnswerInfo> getInfos(String questioner);

    public int deleteAnswer(int id);
}
