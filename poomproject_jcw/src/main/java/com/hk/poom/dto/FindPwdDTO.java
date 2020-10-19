package com.hk.poom.dto;

public class FindPwdDTO {
	
	//아이디
	String id;
	//이름
	String name;
	//이메일
	String email;
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
	
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
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
		return "FindPwdDTO [id=" + id + ", name=" + name + ", email=" + email + ", pwd=" + pwd + "]";
	}
	
}
