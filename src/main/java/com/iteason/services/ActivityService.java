package com.iteason.services;

import com.iteason.dao.ActivityDao;
import com.iteason.entity.Activity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ActivityService {

    @Autowired
    public ActivityDao activityDao;

    public List<Activity> getActivity() {
        return activityDao.getActivity();
    }
}
