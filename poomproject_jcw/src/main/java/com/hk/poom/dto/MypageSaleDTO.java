package com.hk.poom.dto;

import java.util.Date;

public class MypageSaleDTO {

	//글번호
	int bno;
	//제목
	String title;
	//작성자
	String id_writer;
	//작성일
	Date mod_date_b;
	//구매자 아이디
	String id_buyer;
	//분양가
	int cost;
	//상태
	boolean stmt_sale;
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
	public String getId_buyer() {
		return id_buyer;
	}
	public void setId_buyer(String id_buyer) {
		this.id_buyer = id_buyer;
	}
	public int getCost() {
		return cost;
	}
	public void setCost(int cost) {
		this.cost = cost;
	}
	public boolean isStmt_sale() {
		return stmt_sale;
	}
	public void setStmt_sale(boolean stmt_sale) {
		this.stmt_sale = stmt_sale;
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
		return "MypageSaleDTO [bno=" + bno + ", title=" + title + ", id_writer=" + id_writer + ", mod_date_b="
				+ mod_date_b + ", id_buyer=" + id_buyer + ", cost=" + cost + ", stmt_sale=" + stmt_sale + ", pay_num="
				+ pay_num + "]";
	}
	
}
