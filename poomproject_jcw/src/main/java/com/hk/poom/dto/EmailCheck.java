package com.hk.poom.dto;

public class EmailCheck {
	
	String email;
	String code;
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
	@Override
	public String toString() {
		return "EmailCheck [email=" + email + ", code=" + code + "]";
	}
	

}
