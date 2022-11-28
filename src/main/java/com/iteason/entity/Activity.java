package com.iteason.entity;

public class Activity {

    private int id;
    private String activity;
    private String department;
    private String title;
    private String image;

    public Activity() {
    }

    public Activity(int id, String activity, String department, String title, String image) {
        this.id = id;
        this.activity = activity;
        this.department = department;
        this.title = title;
        this.image = image;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getActivity() {
        return activity;
    }

    public void setActivity(String activity) {
        this.activity = activity;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    @Override
    public String toString() {
        return "Activity{" +
                "id=" + id +
                ", activity='" + activity + '\'' +
                ", department='" + department + '\'' +
                ", title='" + title + '\'' +
                ", image='" + image + '\'' +
                '}';
    }
}
