package com.iteason.dao;

import com.iteason.entity.Course;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface CourseDao {

    public List<Course> getCourse();
}
