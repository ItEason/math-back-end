package com.iteason.services;

import com.iteason.dao.CommentDao;
import com.iteason.entity.Comment;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CommentService {

    @Autowired
    private CommentDao commentDao;

    public List<Comment> getComment(int cid) {
        return commentDao.getComment(cid);
    }

    public int insertComment(int cid, String comment, String author, String date, String avatar) {
        return commentDao.insertComment(cid, comment, author, date, avatar);
    }
}
