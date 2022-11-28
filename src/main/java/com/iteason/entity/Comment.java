package com.iteason.entity;

public class Comment {
    private int id;
    private int cid;
    private String comments;
    private String author;
    private String date;
    private String avatar;

    public Comment() {
    }

    public Comment(int id, int cid, String comments, String author, String date, String avatar) {
        this.id = id;
        this.cid = cid;
        this.comments = comments;
        this.author = author;
        this.date = date;
        this.avatar = avatar;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getCid() {
        return cid;
    }

    public void setCid(int cid) {
        this.cid = cid;
    }

    public String getComments() {
        return comments;
    }

    public void setComments(String comments) {
        this.comments = comments;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getAvatar() {
        return avatar;
    }

    public void setAvatar(String avatar) {
        this.avatar = avatar;
    }

    @Override
    public String toString() {
        return "Comment{" +
                "id=" + id +
                ", cid=" + cid +
                ", comments='" + comments + '\'' +
                ", author='" + author + '\'' +
                ", date='" + date + '\'' +
                ", avatar='" + avatar + '\'' +
                '}';
    }
}
