package com.zx.business.pojo;

public class ParkTax {
    private Integer id;

    private String parkName;

    private String pTax;

    private String pElectric;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getParkName() {
        return parkName;
    }

    public void setParkName(String parkName) {
        this.parkName = parkName == null ? null : parkName.trim();
    }

    public String getpTax() {
        return pTax;
    }

    public void setpTax(String pTax) {
        this.pTax = pTax == null ? null : pTax.trim();
    }

    public String getpElectric() {
        return pElectric;
    }

    public void setpElectric(String pElectric) {
        this.pElectric = pElectric == null ? null : pElectric.trim();
    }
}