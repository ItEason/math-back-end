package com.iteason.dao;

import com.iteason.entity.Activity;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface ActivityDao {
    public List<Activity> getActivity();

    public int addActivity(String activity, String department, String title, String image);
}
