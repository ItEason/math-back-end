package com.iteason.services;

import com.iteason.dao.TeacherDao;
import com.iteason.entity.Popular;
import com.iteason.entity.Teacher;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TeacherService {

    @Autowired
    public TeacherDao teacherDao;

    public Teacher getTeacher(String name) {
        return teacherDao.getTeacher(name);
    }

    public Teacher checkTeacher(String username) { return teacherDao.checkTeacher(username); };
}
