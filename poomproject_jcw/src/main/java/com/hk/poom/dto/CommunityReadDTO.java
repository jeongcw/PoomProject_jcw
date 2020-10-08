package com.hk.poom.dto;

import java.util.Date;

public class CommunityReadDTO {

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
	//수정일
	Date mod_date_re;
	//조회수
	int viewCnt;
	//댓글수
	int replyCnt;
	//관심수
	int likeCnt;
	//신고횟수
	int reportCnt;
	
	//댓글번호
	int reno;
	//댓글작성자
	String id_reply;     
	//댓글내용
	String cont_re;
	//댓글작성일
	Date cre_date_re;
	//댓글 비밀글 여부
	boolean secu;
	
	
	// Getter & Setter
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
	public int getReplyCnt() {
		return replyCnt;
	}
	public void setReplyCnt(int replyCnt) {
		this.replyCnt = replyCnt;
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
	public int getReno() {
		return reno;
	}
	public void setReno(int reno) {
		this.reno = reno;
	}
	public String getId_reply() {
		return id_reply;
	}
	public void setId_reply(String id_reply) {
		this.id_reply = id_reply;
	}
	public String getCont_re() {
		return cont_re;
	}
	public void setCont_re(String cont_re) {
		this.cont_re = cont_re;
	}
	public Date getCre_date_re() {
		return cre_date_re;
	}
	public void setCre_date_re(Date cre_date_re) {
		this.cre_date_re = cre_date_re;
	}
	public boolean isSecu() {
		return secu;
	}
	public void setSecu(boolean secu) {
		this.secu = secu;
	}
	
	// toString()
	@Override
	public String toString() {
		return "CommunityReadDTO [bno=" + bno + ", cno=" + cno + ", title=" + title + ", id_writer=" + id_writer
				+ ", cont_b=" + cont_b + ", img_c1=" + img_c1 + ", img_c2=" + img_c2 + ", img_c3=" + img_c3
				+ ", img_c4=" + img_c4 + ", img_c5=" + img_c5 + ", mod_date_re=" + mod_date_re + ", viewCnt=" + viewCnt
				+ ", replyCnt=" + replyCnt + ", likeCnt=" + likeCnt + ", reportCnt=" + reportCnt + ", reno=" + reno
				+ ", id_reply=" + id_reply + ", cont_re=" + cont_re + ", cre_date_re=" + cre_date_re + ", secu=" + secu
				+ "]";
	}

}