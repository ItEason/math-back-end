package com.iteason.entity;

public class Page {
    private int id;
    private String test;
    private String grade;
    private String type;
    private int rate;
    private String pdf;

    private int popular;

    public Page() {
    }

    public Page(int id, String test, String grade, String type, int rate, String pdf, int popular) {
        this.id = id;
        this.test = test;
        this.grade = grade;
        this.type = type;
        this.rate = rate;
        this.pdf = pdf;
        this.popular = popular;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTest() {
        return test;
    }

    public void setTest(String test) {
        this.test = test;
    }

    public String getGrade() {
        return grade;
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getRate() {
        return rate;
    }

    public void setRate(int rate) {
        this.rate = rate;
    }

    public String getPdf() {
        return pdf;
    }

    public void setPdf(String pdf) {
        this.pdf = pdf;
    }

    public int getPopular() {
        return popular;
    }

    public void setPopular(int popular) {
        this.popular = popular;
    }

    @Override
    public String toString() {
        return "Page{" +
                "id=" + id +
                ", test='" + test + '\'' +
                ", grade='" + grade + '\'' +
                ", type='" + type + '\'' +
                ", rate=" + rate +
                ", pdf='" + pdf + '\'' +
                ", popular=" + popular +
                '}';
    }
}
