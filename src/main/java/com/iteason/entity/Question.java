package com.iteason.entity;

public class Question {

    private int id;
    private String comments;
    private String date;

    private String grade;

    private String problem;

    private String questioner;

    private String image;

    public Question() {
    }

    public Question(int id, String comments, String date, String grade, String problem, String questioner, String image) {
        this.id = id;
        this.comments = comments;
        this.date = date;
        this.grade = grade;
        this.problem = problem;
        this.questioner = questioner;
        this.image = image;
    }

    public String getQuestioner() {
        return questioner;
    }

    public void setQuestioner(String questioner) {
        this.questioner = questioner;
    }

    public int getId() {
        return id;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
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

    public String getGrade() {
        return grade;
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }

    public String getProblem() {
        return problem;
    }

    public void setProblem(String problem) {
        this.problem = problem;
    }

    @Override
    public String toString() {
        return "Question{" +
                "id=" + id +
                ", comments='" + comments + '\'' +
                ", date='" + date + '\'' +
                ", grade='" + grade + '\'' +
                ", problem='" + problem + '\'' +
                ", questioner='" + questioner + '\'' +
                ", image='" + image + '\'' +
                '}';
    }
}
