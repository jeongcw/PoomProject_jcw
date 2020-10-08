package com.hk.poom.dto;

import java.util.Date;

public class RehomeListDTO {
	
	//글 유형
	int type_b;
	//분양 카테고리
	int cat_r;
	//게시글 번호
	int bno;
	//분양글 번호
	int rno;
	//제목
	String title;
	//작성자
	String id_writer;
	//사진1
	String img_r1;
	//수정일
	Date mod_date_b;
	//성별
	int gender;
	//나이
	int age;
	//분양가
	int cost;
	//주소
	String address;
	//조회수
	int viewCnt;
	//관심수
	int likeCnt;
	
	
	// Getter & Setter
	public int getType_b() {
		return type_b;
	}
	public void setType_b(int type_b) {
		this.type_b = type_b;
	}
	public int getCat_r() {
		return cat_r;
	}
	public void setCat_r(int cat_r) {
		this.cat_r = cat_r;
	}
	public int getBno() {
		return bno;
	}
	public void setBno(int bno) {
		this.bno = bno;
	}
	public int getRno() {
		return rno;
	}
	public void setRno(int rno) {
		this.rno = rno;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getId_writer() {
		return id_writer;
	}
	public void setId_writer(String id_writer) {
		this.id_writer = id_writer;
	}
	public String getImg_r1() {
		return img_r1;
	}
	public void setImg_r1(String img_r1) {
		this.img_r1 = img_r1;
	}
	public Date getMod_date_b() {
		return mod_date_b;
	}
	public void setMod_date_b(Date mod_date_b) {
		this.mod_date_b = mod_date_b;
	}
	public int getGender() {
		return gender;
	}
	public void setGender(int gender) {
		this.gender = gender;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public int getCost() {
		return cost;
	}
	public void setCost(int cost) {
		this.cost = cost;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public int getViewCnt() {
		return viewCnt;
	}
	public void setViewCnt(int viewCnt) {
		this.viewCnt = viewCnt;
	}
	public int getLikeCnt() {
		return likeCnt;
	}
	public void setLikeCnt(int likeCnt) {
		this.likeCnt = likeCnt;
	}
	
	// toString()
	@Override
	public String toString() {
		return "RehomeListDTO [type_b=" + type_b + ", cat_r=" + cat_r + ", bno=" + bno + ", rno=" + rno + ", title="
				+ title + ", id_writer=" + id_writer + ", img_r1=" + img_r1 + ", mod_date_b=" + mod_date_b + ", gender="
				+ gender + ", age=" + age + ", cost=" + cost + ", address=" + address + ", viewCnt=" + viewCnt
				+ ", likeCnt=" + likeCnt + "]";
	}
	
}
