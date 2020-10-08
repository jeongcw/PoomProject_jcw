package com.hk.poom.dto;

public class FindPwdDTO {
	
	//아이디
	String id;
	//이름
	String name;
	//연락처
	int tel;
	//비밀번호
	String pwd;
	
	
	// Getter & Setter
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
	public int getTel() {
		return tel;
	}
	public void setTel(int tel) {
		this.tel = tel;
	}
	public String getPwd() {
		return pwd;
	}
	public void setPwd(String pwd) {
		this.pwd = pwd;
	}
	
	// toString()
	@Override
	public String toString() {
		return "FindPwdDTO [id=" + id + ", name=" + name + ", tel=" + tel + ", pwd=" + pwd + "]";
	}
	
}
