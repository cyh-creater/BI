package com.zx.system.pojo;

public class SPower {
    private Integer pId;

    private String pName;

    private String url;

    private Integer sort;

    private Integer highlevel;

    public Integer getpId() {
        return pId;
    }

    public void setpId(Integer pId) {
        this.pId = pId;
    }

    public String getpName() {
        return pName;
    }

    public void setpName(String pName) {
        this.pName = pName == null ? null : pName.trim();
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url == null ? null : url.trim();
    }

    public Integer getSort() {
        return sort;
    }

    public void setSort(Integer sort) {
        this.sort = sort;
    }

    public Integer getHighlevel() {
        return highlevel;
    }

    public void setHighlevel(Integer highlevel) {
        this.highlevel = highlevel;
    }
}