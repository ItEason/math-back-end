package com.iteason.dao;

import com.iteason.entity.Comment;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface CommentDao {

    public List<Comment> getComment(int cid);

    public int insertComment(int cid, String comment, String author, String date, String avatar);
}
