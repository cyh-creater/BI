package com.zx.system.pojo;

public class SRP {
    private Integer rPId;

    private Integer rId;

    private Integer pId;

    public Integer getrPId() {
        return rPId;
    }

    public void setrPId(Integer rPId) {
        this.rPId = rPId;
    }

    public Integer getrId() {
        return rId;
    }

    public void setrId(Integer rId) {
        this.rId = rId;
    }

    public Integer getpId() {
        return pId;
    }

    public void setpId(Integer pId) {
        this.pId = pId;
    }

	public SRP(Integer rId, Integer pId) {
		super();
		this.rId = rId;
		this.pId = pId;
	}

	public SRP() {
		super();
	}
    
}