package com.hk.poom.dto;

import java.util.Date;

public class MypageWriteDTO {

	//글번호
	int bno;
	//제목
	String title;
	//작성일
	Date mod_date_b;
	//댓글수
	int replyCnt;
	//조회수
	int viewCnt;
	//관심수
	int likeCnt;
	//신고수
	int reportCnt;
	
	
	// Getter & Setter
	public int getBno() {
		return bno;
	}
	public void setBno(int bno) {
		this.bno = bno;
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
	public int getReplyCnt() {
		return replyCnt;
	}
	public void setReplyCnt(int replyCnt) {
		this.replyCnt = replyCnt;
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
		return "MypageWriteDTO [bno=" + bno + ", title=" + title + ", mod_date_b=" + mod_date_b + ", replyCnt="
				+ replyCnt + ", viewCnt=" + viewCnt + ", likeCnt=" + likeCnt + ", reportCnt=" + reportCnt + "]";
	}
	
}
