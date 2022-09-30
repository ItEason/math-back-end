package com.iteason.entity;

public class Teacher {

    private int age;
    private String department;
    private int id;
    private String tID;
    private String tName;
    private int total;

    public Teacher() {
    }

    public Teacher(String tID, String tName, int age, String department, int total, int id) {
        this.tID = tID;
        this.tName = tName;
        this.age = age;
        this.department = department;
        this.total = total;
        this.id = id;
    }

    public String gettID() {
        return tID;
    }

    public void settID(String tID) {
        this.tID = tID;
    }

    public String gettName() {
        return tName;
    }

    public void settName(String tName) {
        this.tName = tName;
    }

    public int getAge() {
        return age;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }


    @Override
    public String toString() {
        return "Teacher{" +
                "tID='" + tID + '\'' +
                ", tName='" + tName + '\'' +
                ", age=" + age +
                ", department='" + department + '\'' +
                ", total=" + total +
                ", id=" + id +
                '}';
    }
}
