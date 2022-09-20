package com.iteason.entity;

public class Activity {

    private int id;
    private String activity;
    private String department;

    public Activity() {
    }

    public Activity(int id, String activity, String department) {
        this.id = id;
        this.activity = activity;
        this.department = department;
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
                '}';
    }
}
