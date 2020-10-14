package com.hk.poom.dto;

public class ContUploadDTO {
	int bno;
	String imgName;
	@Override
	public String toString() {
		return "ContUploadDTO [bno=" + bno + ", imgName=" + imgName + "]";
	}
	public int getBno() {
		return bno;
	}
	public void setBno(int bno) {
		this.bno = bno;
	}
	public String getImgName() {
		return imgName;
	}
	public void setImgName(String imgName) {
		this.imgName = imgName;
	}
}
