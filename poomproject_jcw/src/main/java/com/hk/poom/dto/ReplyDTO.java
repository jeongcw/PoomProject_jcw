package com.hk.poom.dto;

import java.util.Date;

public class ReplyDTO {
	
	//댓글 번호
	int reno;
	//댓글 작성자
	String id_reply;		
	//댓글 내용
	String cont_re;		
	//비밀 여부
	boolean secu;		
	//댓글 상태
	boolean stmt_re;	
	//댓글 작성 날짜
	Date cre_date_re;
	
	
	// Getter & Setter
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
	public boolean isSecu() {
		return secu;
	}
	public void setSecu(boolean secu) {
		this.secu = secu;
	}
	public boolean isStmt_re() {
		return stmt_re;
	}
	public void setStmt_re(boolean stmt_re) {
		this.stmt_re = stmt_re;
	}
	public Date getCre_date_re() {
		return cre_date_re;
	}
	public void setCre_date_re(Date cre_date_re) {
		this.cre_date_re = cre_date_re;
	}
	
	// toString()
	@Override
	public String toString() {
		return "ReplyDTO [reno=" + reno + ", id_reply=" + id_reply + ", cont_re=" + cont_re + ", secu=" + secu
				+ ", stmt_re=" + stmt_re + ", cre_date_re=" + cre_date_re + "]";
	}
	
}
