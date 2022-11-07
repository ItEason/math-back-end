package com.iteason.dao;

import com.iteason.entity.Course;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface CourseDao {

    public List<Course> getCourse();

    public int getMaxCourse();

    public List<Course> searchCourse(String params);

    public List<Course> getCourseById(int id);

    public int addCourse(String cname, String tname, String contents, String cover);

    public int updateUrl(String url, String cname);
}
