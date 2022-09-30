package com.iteason.services;

import com.iteason.dao.TeacherDao;
import com.iteason.entity.Teacher;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service
public class TeacherService {

    @Autowired
    public TeacherDao teacherDao;

    public List<Teacher> getAllPopular() {
        return teacherDao.getAllPopular();
    }

    public void batchUpdate(String tID, Integer total) { teacherDao.batchUpdate(tID, total); }
}
