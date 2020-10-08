package com.hk.poom.dto;

import java.util.Date;

public class NoticeAddDTO {

	//글 유형
	int type_b;
	//게시글번호
	int bno;
	//공지번호
	int nno; 
	//공지카테고리
	int cat_n; 
	//제목
	String title; 
	//작성일
	Date cre_date_b; 
	//수정일
	Date mod_date_b;; 
	//사진1
	String img_n1;
	//사진2
	String img_n2;
	//사진3
	String img_n3;
	//사진4
	String img_n4;
	//사진5
	String img_n5; 
	//내용
	String cont_b;
	//작성자
	String id_writer;
	//사진유무체크
	boolean img_chk;
	
	
	// Getter & Setter
	public int getType_b() {
		return type_b;
	}
	public void setType_b(int type_b) {
		this.type_b = type_b;
	}
	public int getBno() {
		return bno;
	}
	public void setBno(int bno) {
		this.bno = bno;
	}
	public int getNno() {
		return nno;
	}
	public void setNno(int nno) {
		this.nno = nno;
	}
	public int getCat_n() {
		return cat_n;
	}
	public void setCat_n(int cat_n) {
		this.cat_n = cat_n;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
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
	public String getImg_n1() {
		return img_n1;
	}
	public void setImg_n1(String img_n1) {
		this.img_n1 = img_n1;
	}
	public String getImg_n2() {
		return img_n2;
	}
	public void setImg_n2(String img_n2) {
		this.img_n2 = img_n2;
	}
	public String getImg_n3() {
		return img_n3;
	}
	public void setImg_n3(String img_n3) {
		this.img_n3 = img_n3;
	}
	public String getImg_n4() {
		return img_n4;
	}
	public void setImg_n4(String img_n4) {
		this.img_n4 = img_n4;
	}
	public String getImg_n5() {
		return img_n5;
	}
	public void setImg_n5(String img_n5) {
		this.img_n5 = img_n5;
	}
	public String getCont_b() {
		return cont_b;
	}
	public void setCont_b(String cont_b) {
		this.cont_b = cont_b;
	}
	public String getId_writer() {
		return id_writer;
	}
	public void setId_writer(String id_writer) {
		this.id_writer = id_writer;
	}
	public boolean isImg_chk() {
		return img_chk;
	}
	public void setImg_chk(boolean img_chk) {
		this.img_chk = img_chk;
	}

	// toString()
	@Override
	public String toString() {
		return "NoticeAddDTO [type_b=" + type_b + ", bno=" + bno + ", nno=" + nno + ", cat_n=" + cat_n + ", title="
				+ title + ", cre_date_b=" + cre_date_b + ", mod_date_b=" + mod_date_b + ", img_n1=" + img_n1
				+ ", img_n2=" + img_n2 + ", img_n3=" + img_n3 + ", img_n4=" + img_n4 + ", img_n5=" + img_n5
				+ ", cont_b=" + cont_b + ", id_writer=" + id_writer + ", img_chk=" + img_chk + "]";
	}

}
