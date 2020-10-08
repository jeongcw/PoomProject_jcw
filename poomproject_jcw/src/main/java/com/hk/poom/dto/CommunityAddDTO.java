package com.hk.poom.dto;

import java.util.Date;

public class CommunityAddDTO {

	//글 유형
	int type_b;
	//소통카테고리
	int cat_c;
	//게시글번호
	int bno;           
	//소통글번호
	int cno;      
	//제목
	String title;           
	//작성자
	String id_writer;    
	//내용
	String cont_b;          
	//사진1
	String img_c1;      
	//사진2
	String img_c2;      
	//사진3
	String img_c3;      
	//사진4
	String img_c4;      
	//사진5
	String img_c5;      
	//작성일
	Date cre_date_b;
	//수정일
	Date mod_date_b;
	//사진여부
	int img_chk;

	
	// Getter & Setter
	public int getType_b() {
		return type_b;
	}
	public void setType_b(int type_b) {
		this.type_b = type_b;
	}
	public int getCat_c() {
		return cat_c;
	}
	public void setCat_c(int cat_c) {
		this.cat_c = cat_c;
	}
	public int getBno() {
		return bno;
	}
	public void setBno(int bno) {
		this.bno = bno;
	}
	public int getCno() {
		return cno;
	}
	public void setCno(int cno) {
		this.cno = cno;
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
	public String getImg_c1() {
		return img_c1;
	}
	public void setImg_c1(String img_c1) {
		this.img_c1 = img_c1;
	}
	public String getImg_c2() {
		return img_c2;
	}
	public void setImg_c2(String img_c2) {
		this.img_c2 = img_c2;
	}
	public String getImg_c3() {
		return img_c3;
	}
	public void setImg_c3(String img_c3) {
		this.img_c3 = img_c3;
	}
	public String getImg_c4() {
		return img_c4;
	}
	public void setImg_c4(String img_c4) {
		this.img_c4 = img_c4;
	}
	public String getImg_c5() {
		return img_c5;
	}
	public void setImg_c5(String img_c5) {
		this.img_c5 = img_c5;
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
	public int getImg_chk() {
		return img_chk;
	}
	public void setImg_chk(int img_chk) {
		this.img_chk = img_chk;
	}
	
	// toString()
	@Override
	public String toString() {
		return "CommunityAddDTO [type_b=" + type_b + ", cat_c=" + cat_c + ", bno=" + bno + ", cno=" + cno + ", title="
				+ title + ", id_writer=" + id_writer + ", cont_b=" + cont_b + ", img_c1=" + img_c1 + ", img_c2="
				+ img_c2 + ", img_c3=" + img_c3 + ", img_c4=" + img_c4 + ", img_c5=" + img_c5 + ", cre_date_b="
				+ cre_date_b + ", mod_date_b=" + mod_date_b + ", img_chk=" + img_chk + "]";
	}

}
