package com.iteason.dao;

import com.iteason.entity.Teacher;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
import java.util.Map;

@Mapper
public interface TeacherDao {

    public List<Teacher> getAllPopular();

    public void batchUpdate(String tID, Integer total);
}
