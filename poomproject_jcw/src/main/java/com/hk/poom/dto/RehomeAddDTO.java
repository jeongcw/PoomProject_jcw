package com.hk.poom.dto;

import java.util.Date;

public class RehomeAddDTO {

	//카테고리 이름
	String cateName;
	//게시글 번호
	int bno;
	//분양글 번호
	int rno;
	//회원번호
	int mno;
	//제목
	String title;
	//작성자
	String id_writer;
	//분양글 사진1-main
	String img_r1;
	//분양글 사진2
	String img_r2;
	//분양글 사진3
	String img_r3;
	//분양글 사진4
	String img_r4;
	//분양글 사진5
	String img_r5;
	//카테고리 대분류
	String cateCode;
	//카테고리 소분류
	String cateCodeRef;
	//성별
	int gender;
	//접종여부
	int vac;
	//나이
	int age;
	//중성화여부
	int neut;
	//분양가
	int cost;
	//내용
	String cont_b;
	//작성일
	Date cre_date_b;
	//수정일
	Date mod_date_b;

	//조회수
	int viewcnt;
	//좋아요수
	int likecnt;
	//신고수
	int reportcnt;
	//회원상태
	int stmt_b;


	// Getter & Setter

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
	public String getImg_r2() {
		return img_r2;
	}
	public void setImg_r2(String img_r2) {
		this.img_r2 = img_r2;
	}
	public String getImg_r3() {
		return img_r3;
	}
	public void setImg_r3(String img_r3) {
		this.img_r3 = img_r3;
	}
	public String getImg_r4() {
		return img_r4;
	}
	public void setImg_r4(String img_r4) {
		this.img_r4 = img_r4;
	}
	public String getImg_r5() {
		return img_r5;
	}
	public void setImg_r5(String img_r5) {
		this.img_r5 = img_r5;
	}

	public int getGender() {
		return gender;
	}
	public void setGender(int gender) {
		this.gender = gender;
	}
	public int getVac() {
		return vac;
	}
	public void setVac(int vac) {
		this.vac = vac;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public int getNeut() {
		return neut;
	}
	public void setNeut(int neut) {
		this.neut = neut;
	}
	public int getCost() {
		return cost;
	}
	public void setCost(int cost) {
		this.cost = cost;
	}
	public String getCont_b() {
		return cont_b;
	}
	public void setCont_b(String cont_b) {
		this.cont_b = cont_b;
	}
	public Date getCre_date_b() {
		return cre_date_b;
	}
	public void setCre_date_b(Date cre_date_b) {
		this.cre_date_b = cre_date_b;
	}
	public Date getMod_date_b() {
		return mod_date_b;
	}
	public void setMod_date_b(Date mod_date_b) {
		this.mod_date_b = mod_date_b;
	}
	public int getViewcnt() {
		return viewcnt;
	}
	public void setViewcnt(int viewcnt) {
		this.viewcnt = viewcnt;
	}

	public int getLikecnt() {
		return likecnt;
	}
	public void setLikecnt(int likecnt) {
		this.likecnt = likecnt;
	}

	public int getReportcnt() {
		return reportcnt;
	}
	public void setReportcnt(int reportcnt) {
		this.reportcnt = reportcnt;
	}

	public int getStmt_b() {
		return stmt_b;
	}
	public void setStmt_b(int stmt_b) {
		this.stmt_b = stmt_b;
	}
	public int getMno() {
		return mno;
	}
	public void setMno(int mno) {
		this.mno = mno;
	}

	public String getCateName() {
		return cateName;
	}
	public void setCateName(String cateName) {
		this.cateName = cateName;
	}
	public String getCateCode() {
		return cateCode;
	}
	public void setCateCode(String cateCode) {
		this.cateCode = cateCode;
	}
	
	
	public String getCateCodeRef() {
		return cateCodeRef;
	}
	public void setCateCodeRef(String cateCodeRef) {
		this.cateCodeRef = cateCodeRef;
	}
	@Override
	public String toString() {
		return "RehomeAddDTO [cateName=" + cateName + ", bno=" + bno + ", rno=" + rno + ", mno=" + mno + ", title="
				+ title + ", id_writer=" + id_writer + ", img_r1=" + img_r1 + ", img_r2=" + img_r2 + ", img_r3="
				+ img_r3 + ", img_r4=" + img_r4 + ", img_r5=" + img_r5 + ", cateCode=" + cateCode + ", cateCodeRef="
				+ cateCodeRef + ", gender=" + gender + ", vac=" + vac + ", age=" + age + ", neut=" + neut + ", cost="
				+ cost + ", cont_b=" + cont_b + ", cre_date_b=" + cre_date_b + ", mod_date_b=" + mod_date_b
				+ ", viewcnt=" + viewcnt + ", likecnt=" + likecnt + ", reportcnt=" + reportcnt + ", stmt_b=" + stmt_b
				+ "]";
	}

}