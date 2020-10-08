package com.hk.poom.dto;

public class OtherpageDTO {

	//유형(0~2)
	int type_m;
	//아이디
	String id; 
	//이름
	String name;
	//멘트
	String ment;
	//프로필 사진
	String prof;
	//사업자등록번호
	int brn;
	//사업자등록증
	String brn_img;
	
	
	// Getter & Setter
	public int getType_m() {
		return type_m;
	}
	public void setType_m(int type_m) {
		this.type_m = type_m;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getMent() {
		return ment;
	}
	public void setMent(String ment) {
		this.ment = ment;
	}
	public String getProf() {
		return prof;
	}
	public void setProf(String prof) {
		this.prof = prof;
	}
	public int getBrn() {
		return brn;
	}
	public void setBrn(int brn) {
		this.brn = brn;
	}
	public String getBrn_img() {
		return brn_img;
	}
	public void setBrn_img(String brn_img) {
		this.brn_img = brn_img;
	}
	
	// toString()
	@Override
	public String toString() {
		return "OtherpageDTO [type_m=" + type_m + ", id=" + id + ", name=" + name + ", ment=" + ment + ", prof=" + prof
				+ ", brn=" + brn + ", brn_img=" + brn_img + "]";
	}
	
}
