package com.iteason.entity;

public class Answer {
    private String content;
    private String answerer;
    private String image;
    private int qid;

    public Answer() {
    }

    public Answer(String content, String answerer, String image, int qid) {
        this.content = content;
        this.answerer = answerer;
        this.image = image;
        this.qid = qid;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
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

    public int getQid() {
        return qid;
    }

    public void setQid(int qid) {
        this.qid = qid;
    }

    @Override
    public String toString() {
        return "Answer{" +
                "content='" + content + '\'' +
                ", answerer='" + answerer + '\'' +
                ", image='" + image + '\'' +
                ", qid=" + qid +
                '}';
    }
}
