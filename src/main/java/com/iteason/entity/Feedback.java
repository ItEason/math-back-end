package com.iteason.entity;

public class Feedback {

    private int id;
    private String comments;
    private String date;

    public Feedback() {
    }

    public Feedback(int id, String comments, String date) {
        this.id = id;
        this.comments = comments;
        this.date = date;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getComments() {
        return comments;
    }

    public void setComments(String comments) {
        this.comments = comments;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    @Override
    public String toString() {
        return "Feedback{" +
                "id=" + id +
                ", comments='" + comments + '\'' +
                ", date='" + date + '\'' +
                '}';
    }
}
