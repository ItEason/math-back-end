package com.iteason.entity;


public class User {
    private int id;
    private String username;
    private String password;
    private String sex;
    private int age;
    private String img_url;

    public User() {
    }

    public User(int id, String username, String password, String sex, int age, String img_url) {
        this.id = id;
        this.username = username;
        this.password = password;
        this.sex = sex;
        this.age = age;
        this.img_url = img_url;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getImgSrc() {
        return img_url;
    }

    public void setImgSrc(String img_url) {
        this.img_url = img_url;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", sex='" + sex + '\'' +
                ", age=" + age +
                ", imgSrc='" + img_url + '\'' +
                '}';
    }

}
