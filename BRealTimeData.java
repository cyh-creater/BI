package com.zx.business.pojo;

public class BRealTimeData {
    private Integer id;

    private String rType;

    private String rNumber;

    private String rRising;

    private String rQnumber;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getrType() {
        return rType;
    }

    public void setrType(String rType) {
        this.rType = rType == null ? null : rType.trim();
    }

    public String getrNumber() {
        return rNumber;
    }

    public void setrNumber(String rNumber) {
        this.rNumber = rNumber == null ? null : rNumber.trim();
    }

    public String getrRising() {
        return rRising;
    }

    public void setrRising(String rRising) {
        this.rRising = rRising == null ? null : rRising.trim();
    }

    public String getrQnumber() {
        return rQnumber;
    }

    public void setrQnumber(String rQnumber) {
        this.rQnumber = rQnumber == null ? null : rQnumber.trim();
    }
}