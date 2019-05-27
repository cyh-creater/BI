package com.zx.business.pojo;

public class BPark {
    private Integer id;

    private String yName;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getyName() {
        return yName;
    }

    public void setyName(String yName) {
        this.yName = yName == null ? null : yName.trim();
    }
    
}