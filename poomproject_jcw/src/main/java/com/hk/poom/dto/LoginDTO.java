package com.hk.poom.dto;

public class LoginDTO {

	//아이디
	String id;
	//비밀번호
	String pwd;
	//이메일
	String email;
	//회원 유형
	int type_m;
	//회원번호
	int mno;
	//이름
	String name;
	//프로필 사진
	String prof;
	
	
	// Getter & Setter
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getPwd() {
		return pwd;
	}
	public void setPwd(String pwd) {
		this.pwd = pwd;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public int getType_m() {
		return type_m;
	}
	public void setType_m(int type_m) {
		this.type_m = type_m;
	}
	public int getMno() {
		return mno;
	}
	public void setMno(int mno) {
		this.mno = mno;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getProf() {
		return prof;
	}
	public void setProf(String prof) {
		this.prof = prof;
	}
	
	// toString()
	@Override
	public String toString() {
		return "LoginDTO [id=" + id + ", pwd=" + pwd + ", email=" + email + ", type_m=" + type_m + ", mno=" + mno
				+ ", name=" + name + ", prof=" + prof + "]";
	}
	
}
