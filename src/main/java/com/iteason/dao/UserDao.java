package com.iteason.dao;

import com.iteason.entity.User;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface UserDao {

    public User getUser(String username);
}
