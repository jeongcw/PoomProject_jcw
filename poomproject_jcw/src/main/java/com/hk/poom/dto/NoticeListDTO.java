package com.hk.poom.dto;

import java.util.Date;

public class NoticeListDTO {

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
	//수정일
	Date mod_date_b;
	//작성자
	String id_writer;
	//사진유무체크
	boolean img_chk;
	//조회수
	int viewCnt;
	
	
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
	public Date getMod_date_b() {
		return mod_date_b;
	}
	public void setMod_date_b(Date mod_date_b) {
		this.mod_date_b = mod_date_b;
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
	public int getViewCnt() {
		return viewCnt;
	}
	public void setViewCnt(int viewCnt) {
		this.viewCnt = viewCnt;
	}
	
	// toString()
	@Override
	public String toString() {
		return "NoticeListDTO [type_b=" + type_b + ", bno=" + bno + ", nno=" + nno + ", cat_n=" + cat_n + ", title="
				+ title + ", mod_date_b=" + mod_date_b + ", id_writer=" + id_writer + ", img_chk=" + img_chk
				+ ", viewCnt=" + viewCnt + "]";
	}
	
}
