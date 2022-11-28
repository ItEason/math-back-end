package com.iteason.services;

import com.iteason.dao.CourseDao;
import com.iteason.entity.Course;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CourseService {

    @Autowired
    public CourseDao courseDao;

    public List<Course> getCourse() {
        return courseDao.getCourse();
    }

    public int getMaxCourse() {
        return courseDao.getMaxCourse();
    }

    public List<Course> searchCourse(String params) {
        return courseDao.searchCourse(params);
    }

    public List<Course> getCourseById(int id) {
        return courseDao.getCourseById(id);
    }

    public int addCourse(String cname, String tname, String contents, String cover) {
        return courseDao.addCourse(cname, tname, contents, cover);
    }

    public int updateUrl(String url, String cname) {
        return courseDao.updateUrl(url, cname);
    }

    public int updateClick(int cid) {
        return courseDao.updateClick(cid);
    }
}
