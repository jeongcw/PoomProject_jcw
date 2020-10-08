package com.hk.poom.dto;

import java.util.Date;

public class MypageLikeDTO {
	
	//글번호
	int bno;
	//게시글 유형
	int type_b;
	//제목
	String title;
	//작성자
	String id_writer;
	//작성일
	Date mod_date_b;
	
	
	// Getter & Setter
	public int getBno() {
		return bno;
	}
	public void setBno(int bno) {
		this.bno = bno;
	}
	public int getType_b() {
		return type_b;
	}
	public void setType_b(int type_b) {
		this.type_b = type_b;
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
	public Date getMod_date_b() {
		return mod_date_b;
	}
	public void setMod_date_b(Date mod_date_b) {
		this.mod_date_b = mod_date_b;
	}
	
	// toString()
	@Override
	public String toString() {
		return "MypageLikeDTO [bno=" + bno + ", type_b=" + type_b + ", title=" + title + ", id_writer=" + id_writer
				+ ", mod_date_b=" + mod_date_b + "]";
	}
	
}
