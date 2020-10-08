package com.hk.poom.dto;

import java.util.Date;

public class RehomeReadDTO {
	
	//게시글번호
	int bno;           
	//분양글번호
	int rno;       
	//제목
	String title;           
	//작성자
	String id_writer;     
	//내용
	String cont_b;          
	//사진1-main
	String img_r1;      
	//사진2
	String img_r2;      
	//사진3
	String img_r3;      
	//사진4
	String img_r4;      
	//사진5
	String img_r5;
	//수정일
	Date mod_date_re;
	//조회수
	int viewCnt;
	//문의수
	
	//관심수
	int likeCnt;
	//신고횟수
	int reportCnt;
	
	
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
	public String getCont_b() {
		return cont_b;
	}
	public void setCont_b(String cont_b) {
		this.cont_b = cont_b;
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
	public Date getMod_date_re() {
		return mod_date_re;
	}
	public void setMod_date_re(Date mod_date_re) {
		this.mod_date_re = mod_date_re;
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
	public int getReportCnt() {
		return reportCnt;
	}
	public void setReportCnt(int reportCnt) {
		this.reportCnt = reportCnt;
	}
	
	// toString()
	@Override
	public String toString() {
		return "RehomeReadDTO [bno=" + bno + ", rno=" + rno + ", title=" + title + ", id_writer=" + id_writer
				+ ", cont_b=" + cont_b + ", img_r1=" + img_r1 + ", img_r2=" + img_r2 + ", img_r3=" + img_r3
				+ ", img_r4=" + img_r4 + ", img_r5=" + img_r5 + ", mod_date_re=" + mod_date_re + ", viewCnt=" + viewCnt
				+ ", likeCnt=" + likeCnt + ", reportCnt=" + reportCnt + "]";
	}
	
}
