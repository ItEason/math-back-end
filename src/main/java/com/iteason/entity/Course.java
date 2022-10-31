package com.iteason.entity;

public class Course {

    private String cid;
    private String cname;
    private String tname;
    private String url;
    private String contents;
    private String cover;

    public Course() {
    }

    public Course(String cid, String cname, String tname, String url, String contents, String cover) {
        this.cid = cid;
        this.cname = cname;
        this.tname = tname;
        this.url = url;
        this.contents = contents;
        this.cover = cover;
    }

    public String getCid() {
        return cid;
    }

    public void setCid(String cid) {
        this.cid = cid;
    }

    public String getCname() {
        return cname;
    }

    public void setCname(String cname) {
        this.cname = cname;
    }

    public String getTname() {
        return tname;
    }

    public void setTname(String tname) {
        this.tname = tname;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getContents() {
        return contents;
    }

    public void setContents(String contents) {
        this.contents = contents;
    }

    public String getCover() {
        return cover;
    }

    public void setCover(String cover) {
        this.cover = cover;
    }

    @Override
    public String toString() {
        return "Course{" +
                "cid=" + cid +
                ", cname='" + cname + '\'' +
                ", tname='" + tname + '\'' +
                ", url='" + url + '\'' +
                ", contents='" + contents + '\'' +
                ", cover='" + cover + '\'' +
                '}';
    }
}
