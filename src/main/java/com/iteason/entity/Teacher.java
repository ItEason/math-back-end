package com.iteason.entity;

public class Teacher {
    private String tid;
    private String tname;
    private String info;
    private String weChat;
    private String email;
    private String tel;

    public Teacher() {
    }

    public Teacher(String tid, String tname, String info, String weChat, String email, String tel) {
        this.tid = tid;
        this.tname = tname;
        this.info = info;
        this.weChat = weChat;
        this.email = email;
        this.tel = tel;
    }

    public String getTid() {
        return tid;
    }

    public void setTid(String tid) {
        this.tid = tid;
    }

    public String getTname() {
        return tname;
    }

    public void setTname(String tname) {
        this.tname = tname;
    }

    public String getInfo() {
        return info;
    }

    public void setInfo(String info) {
        this.info = info;
    }

    public String getWeChat() {
        return weChat;
    }

    public void setWeChat(String weChat) {
        this.weChat = weChat;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

    @Override
    public String toString() {
        return "Teacher{" +
                "tid='" + tid + '\'' +
                ", tname='" + tname + '\'' +
                ", info='" + info + '\'' +
                ", weChat='" + weChat + '\'' +
                ", email='" + email + '\'' +
                ", tel='" + tel + '\'' +
                '}';
    }
}
