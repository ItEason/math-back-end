package com.iteason.entity;

public class AnswerInfo {
    private int id;
    private String contents;
    private String answerer;
    private String image;
    private String comments;

    private int qid;

    public AnswerInfo() {
    }

    public AnswerInfo(int id, String contents, String answerer, String image, String comments, int qid) {
        this.id = id;
        this.contents = contents;
        this.answerer = answerer;
        this.image = image;
        this.comments = comments;
        this.qid = qid;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getContents() {
        return contents;
    }

    public void setContents(String contents) {
        this.contents = contents;
    }

    public String getAnswerer() {
        return answerer;
    }

    public void setAnswerer(String answerer) {
        this.answerer = answerer;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public String getComments() {
        return comments;
    }

    public void setComments(String comments) {
        this.comments = comments;
    }

    public int getQid() {
        return qid;
    }

    public void setQid(int qid) {
        this.qid = qid;
    }

    @Override
    public String toString() {
        return "AnswerInfo{" +
                "id=" + id +
                ", contents='" + contents + '\'' +
                ", answerer='" + answerer + '\'' +
                ", image='" + image + '\'' +
                ", comments='" + comments + '\'' +
                ", qid=" + qid +
                '}';
    }
}
