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
    };
}
