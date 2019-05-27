package com.zx.business.pojo;

public class BPm {
    private Integer id;

    private String pmData;

    private String pmTax;

    private Float pmElectric;

    private Integer pId;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getPmData() {
        return pmData;
    }

    public void setPmData(String pmData) {
        this.pmData = pmData == null ? null : pmData.trim();
    }

    public String getPmTax() {
        return pmTax;
    }

    public void setPmTax(String pmTax) {
        this.pmTax = pmTax == null ? null : pmTax.trim();
    }

    public Float getPmElectric() {
        return pmElectric;
    }

    public void setPmElectric(Float pmElectric) {
        this.pmElectric = pmElectric;
    }

    public Integer getpId() {
        return pId;
    }

    public void setpId(Integer pId) {
        this.pId = pId;
    }
}