package com.hk.poom.dto;

public class ProfUploadDTO {

	//회원 번호
	int mno;
	//파일 이름 (prof)
	String dbSaveName;
	
	
	// Getter & Setter
	public int getMno() {
		return mno;
	}
	public void setMno(int mno) {
		this.mno = mno;
	}
	public String getDbSaveName() {
		return dbSaveName;
	}
	public void setDbSaveName(String dbSaveName) {
		this.dbSaveName = dbSaveName;
	}
	
	// toString()
	@Override
	public String toString() {
		return "profUploadDTO [mno=" + mno + ", dbSaveName=" + dbSaveName + "]";
	}
	
}
