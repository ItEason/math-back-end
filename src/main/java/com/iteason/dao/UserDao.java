package com.iteason.dao;

import com.iteason.entity.User;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface UserDao {

    public User getUser(String username);

    public int insertUser(String username, String password, String img_url);

    public User selectUser(Integer userId);

    public List<User> selectUsers();

    public List<User> getUserByName(String name);

    /* 更新用户的积分score函数 */
    public int updateScore(int score, String username);
}
