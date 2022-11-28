package com.iteason.controller;

import com.iteason.entity.Comment;
import com.iteason.services.CommentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

@RestController
@RequestMapping("/api")
public class CommentController {

    @Autowired
    private CommentService commentService;

    @GetMapping("/getComment")
    public List<Comment> getComment(@RequestParam("cid") int cid) {
        return commentService.getComment(cid);
    }

    @GetMapping("/insertComment")
    public int insertComment(@RequestParam("cid") int cid, @RequestParam("comment") String comment, @RequestParam("author") String author, @RequestParam("avatar") String avatar) {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        Date now = new Date();

        /* 将系统时间转换为指定的格式 */
        String date = sdf.format(now);

        return commentService.insertComment(cid, comment, author, date, avatar);
    }
}
