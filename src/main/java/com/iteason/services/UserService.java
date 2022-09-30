package com.iteason.services;

import com.iteason.dao.UserDao;
import com.iteason.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    @Autowired
    public UserDao userDao;

    public User getUser(String username) {
        return userDao.getUser(username);
    }

    public int insertUser(String username, String password, String img_url) {
        return userDao.insertUser(username, password, img_url);
    }
}
