package com.iteason.entity;

public class Feedback {
    private int id;
    private String feedback;
    private String date;

    public Feedback() {
    }

    public Feedback(int id, String feedback, String date) {
        this.id = id;
        this.feedback = feedback;
        this.date = date;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFeedback() {
        return feedback;
    }

    public void setFeedback(String feedback) {
        this.feedback = feedback;
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
                ", feedback='" + feedback + '\'' +
                ", date='" + date + '\'' +
                '}';
    }
}
