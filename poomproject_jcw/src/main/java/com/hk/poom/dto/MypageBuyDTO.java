package com.hk.poom.dto;

import java.util.Date;

public class MypageBuyDTO {

	//글번호
	int bno;
	//제목
	String title;
	//구매자
	String id_buyer;
	//작성일
	Date mod_date_b;
	//판매자 아이디
	String id_saler;
	//분양가
	int cost;
	//상태
	boolean stmt_buy;
	//결제번호
	int pay_num;
	
	
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
	public String getId_buyer() {
		return id_buyer;
	}
	public void setId_buyer(String id_buyer) {
		this.id_buyer = id_buyer;
	}
	public Date getMod_date_b() {
		return mod_date_b;
	}
	public void setMod_date_b(Date mod_date_b) {
		this.mod_date_b = mod_date_b;
	}
	public String getId_saler() {
		return id_saler;
	}
	public void setId_saler(String id_saler) {
		this.id_saler = id_saler;
	}
	public int getCost() {
		return cost;
	}
	public void setCost(int cost) {
		this.cost = cost;
	}
	public boolean isStmt_buy() {
		return stmt_buy;
	}
	public void setStmt_buy(boolean stmt_buy) {
		this.stmt_buy = stmt_buy;
	}
	public int getPay_num() {
		return pay_num;
	}
	public void setPay_num(int pay_num) {
		this.pay_num = pay_num;
	}
	
	// toString()
	@Override
	public String toString() {
		return "MypageBuyDTO [bno=" + bno + ", title=" + title + ", id_buyer=" + id_buyer + ", mod_date_b=" + mod_date_b
				+ ", id_saler=" + id_saler + ", cost=" + cost + ", stmt_buy=" + stmt_buy + ", pay_num=" + pay_num + "]";
	}
		
}
