package com.hk.poom.dto;

public class NoticeReadDTO {

	//게시글번호
	int bno;           
	//공지글번호
	int nno;       
	//제목
	String title;              
	//내용
	String cont_b;          
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
	//조회수
	int viewCnt;
	
	
	// Getter & Setter
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
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getCont_b() {
		return cont_b;
	}
	public void setCont_b(String cont_b) {
		this.cont_b = cont_b;
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
	public int getViewCnt() {
		return viewCnt;
	}
	public void setViewCnt(int viewCnt) {
		this.viewCnt = viewCnt;
	}
	
	// toString()
	@Override
	public String toString() {
		return "NoticeReadDTO [bno=" + bno + ", nno=" + nno + ", title=" + title + ", cont_b=" + cont_b + ", img_n1="
				+ img_n1 + ", img_n2=" + img_n2 + ", img_n3=" + img_n3 + ", img_n4=" + img_n4 + ", img_n5=" + img_n5
				+ ", viewCnt=" + viewCnt + "]";
	}
	
}
