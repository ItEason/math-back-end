package com.iteason.entity;


import lombok.Data;

@Data    // 为属性加上getset方法
public class Schedule {
    private int id;
    private String name;

    private int age;
    private String department;
    private String date;
    private String day;

    public Schedule(int id, String name, int age, String department, String date, String day) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.department = department;
        this.date = date;
        this.day = day;
    }

    public int getId() {
        return id;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getDay() {
        return day;
    }

    public void setDay(String day) {
        this.day = day;
    }

    @Override
    public String toString() {
        return "Schedule{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", department='" + department + '\'' +
                ", date='" + date + '\'' +
                ", day='" + day + '\'' +
                '}';
    }
}
