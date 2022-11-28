package com.iteason.dao;

import com.iteason.entity.Schedule;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface ScheduleDao {
    public List<Schedule> getTeacher(String day);

    public int insertSchedule(String name, int age, String department, String date, String day);
}
