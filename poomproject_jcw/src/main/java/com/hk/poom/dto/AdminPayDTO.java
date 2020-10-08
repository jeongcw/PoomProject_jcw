package com.hk.poom.dto;

import java.util.Date;

public class AdminPayDTO {

	//결제 번호
	int pay_num;   
	//제목
	String title;   
	//판매 상태
	boolean stmt_sale;
	//구매 상태
	boolean stmt_buy;
	//결제일
	Date pay_date;   
	//분양가
	int cost;   
	//판매자 아이디
	String id_saler;   
	//구매자 아이디
	String id_buyer;   
	//판매자 연락처
	int tel_saler;   
	//구매자 연락처
 	int tel_buyer;   
	//분양 카테고리
	int cat_r;   
	//판매횟수
	int saleCnt;
	//구매횟수
	int buyCnt;
	
	
	// Getter & Setter
	public int getPay_num() {
		return pay_num;
	}
	public void setPay_num(int pay_num) {
		this.pay_num = pay_num;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public boolean isStmt_sale() {
		return stmt_sale;
	}
	public void setStmt_sale(boolean stmt_sale) {
		this.stmt_sale = stmt_sale;
	}
	public boolean isStmt_buy() {
		return stmt_buy;
	}
	public void setStmt_buy(boolean stmt_buy) {
		this.stmt_buy = stmt_buy;
	}
	public Date getPay_date() {
		return pay_date;
	}
	public void setPay_date(Date pay_date) {
		this.pay_date = pay_date;
	}
	public int getCost() {
		return cost;
	}
	public void setCost(int cost) {
		this.cost = cost;
	}
	public String getId_saler() {
		return id_saler;
	}
	public void setId_saler(String id_saler) {
		this.id_saler = id_saler;
	}
	public String getId_buyer() {
		return id_buyer;
	}
	public void setId_buyer(String id_buyer) {
		this.id_buyer = id_buyer;
	}
	public int getTel_saler() {
		return tel_saler;
	}
	public void setTel_saler(int tel_saler) {
		this.tel_saler = tel_saler;
	}
	public int getTel_buyer() {
		return tel_buyer;
	}
	public void setTel_buyer(int tel_buyer) {
		this.tel_buyer = tel_buyer;
	}
	public int getCat_r() {
		return cat_r;
	}
	public void setCat_r(int cat_r) {
		this.cat_r = cat_r;
	}
	public int getSaleCnt() {
		return saleCnt;
	}
	public void setSaleCnt(int saleCnt) {
		this.saleCnt = saleCnt;
	}
	public int getBuyCnt() {
		return buyCnt;
	}
	public void setBuyCnt(int buyCnt) {
		this.buyCnt = buyCnt;
	}
	
	// toString()
	@Override
	public String toString() {
		return "AdminPayDTO [pay_num=" + pay_num + ", title=" + title + ", stmt_sale=" + stmt_sale + ", stmt_buy="
				+ stmt_buy + ", pay_date=" + pay_date + ", cost=" + cost + ", id_saler=" + id_saler + ", id_buyer="
				+ id_buyer + ", tel_saler=" + tel_saler + ", tel_buyer=" + tel_buyer + ", cat_r=" + cat_r + ", saleCnt="
				+ saleCnt + ", buyCnt=" + buyCnt + "]";
	}
	
}
