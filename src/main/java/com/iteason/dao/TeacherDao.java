package com.iteason.dao;

import com.iteason.entity.Popular;
import com.iteason.entity.Teacher;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface TeacherDao {

    public Teacher getTeacher(String name);

    public Teacher checkTeacher(String username);
}
