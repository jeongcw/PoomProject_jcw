package com.hk.poom.dto;

import java.util.Date;

public class MypageDTO {

	//유형(0~2)
	int type_m;
	//회원번호
	int mno;
	//회원상태
	boolean stmt_m;
	//아이디
	String id;
	//비밀번호
	String pwd;
	//이메일
	String email;
	//연락처
	int tel;
	//이름
	String name;
	//주소
	String address;
	//멘트
	String ment;
	//프로필 사진
	String prof;
	//가입일
	Date cre_date_m;
	//수정일
	Date mod_date_m;
	//사업자 등록번호
	int brn;
	//사업자 등록증
	String brn_img;
	//사이트
	String url_c;
	//관심 분야
	int fav;
	//애완동물 유무
	boolean pet;
	
	
	// Getter & Setter
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
	public boolean isStmt_m() {
		return stmt_m;
	}
	public void setStmt_m(boolean stmt_m) {
		this.stmt_m = stmt_m;
	}
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
	public int getTel() {
		return tel;
	}
	public void setTel(int tel) {
		this.tel = tel;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
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
	public Date getCre_date_m() {
		return cre_date_m;
	}
	public void setCre_date_m(Date cre_date_m) {
		this.cre_date_m = cre_date_m;
	}
	public Date getMod_date_m() {
		return mod_date_m;
	}
	public void setMod_date_m(Date mod_date_m) {
		this.mod_date_m = mod_date_m;
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
	public String getUrl_c() {
		return url_c;
	}
	public void setUrl_c(String url_c) {
		this.url_c = url_c;
	}
	public int getFav() {
		return fav;
	}
	public void setFav(int fav) {
		this.fav = fav;
	}
	public boolean isPet() {
		return pet;
	}
	public void setPet(boolean pet) {
		this.pet = pet;
	}
	
	// toString()
	@Override
	public String toString() {
		return "MypageDTO [type_m=" + type_m + ", mno=" + mno + ", stmt_m=" + stmt_m + ", id=" + id + ", pwd=" + pwd
				+ ", email=" + email + ", tel=" + tel + ", name=" + name + ", address=" + address + ", ment=" + ment
				+ ", prof=" + prof + ", cre_date_m=" + cre_date_m + ", mod_date_m=" + mod_date_m + ", brn=" + brn
				+ ", brn_img=" + brn_img + ", url_c=" + url_c + ", fav=" + fav + ", pet=" + pet + "]";
	}
	
}
