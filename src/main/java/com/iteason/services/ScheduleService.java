package com.iteason.services;

import com.iteason.dao.ScheduleDao;
import com.iteason.entity.Schedule;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ScheduleService {

    @Autowired    //注入userDao对象
    private ScheduleDao teacherDao;

    public List<Schedule> getTeacher(String day){
        return teacherDao.getTeacher(day);
    }
}
