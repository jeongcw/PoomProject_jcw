package com.hk.poom.dto;

import java.util.Date;

public class MypageChatDTO {

	//채팅유형
	int type_ch;
	//제목
	String title;
	//채팅 작성일
	Date cre_date_ch;
	//보낸이
	String id_sender;
	//받는이
	String id_reciever;
	//프로필
	String prof;
	
	
	// Getter & Setter
	public int getType_ch() {
		return type_ch;
	}
	public void setType_ch(int type_ch) {
		this.type_ch = type_ch;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public Date getCre_date_ch() {
		return cre_date_ch;
	}
	public void setCre_date_ch(Date cre_date_ch) {
		this.cre_date_ch = cre_date_ch;
	}
	public String getId_sender() {
		return id_sender;
	}
	public void setId_sender(String id_sender) {
		this.id_sender = id_sender;
	}
	public String getId_reciever() {
		return id_reciever;
	}
	public void setId_reciever(String id_reciever) {
		this.id_reciever = id_reciever;
	}
	public String getProf() {
		return prof;
	}
	public void setProf(String prof) {
		this.prof = prof;
	}
	
	// toString()
	@Override
	public String toString() {
		return "MypageChatDTO [type_ch=" + type_ch + ", title=" + title + ", cre_date_ch=" + cre_date_ch
				+ ", id_sender=" + id_sender + ", id_reciever=" + id_reciever + ", prof=" + prof + "]";
	}
		
}
