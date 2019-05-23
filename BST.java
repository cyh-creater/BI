package com.zx.business.pojo;

public class BST {
    private Integer id;

    private String priject;

    private String time;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getPriject() {
        return priject;
    }

    public void setPriject(String priject) {
        this.priject = priject == null ? null : priject.trim();
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time == null ? null : time.trim();
    }
}