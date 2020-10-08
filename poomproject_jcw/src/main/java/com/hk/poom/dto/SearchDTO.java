package com.hk.poom.dto;

public class SearchDTO {

	//게시글 유형
	int type_b;
	//각 게시판의 카테고리
	int cat_r;
	int cat_c;
	int cat_n;
	//제목
	String title;
	//내용 
	String cont_b;
	//작성자
	String id_writer;
	//검색어
	String search;
	
	
	// Getter & Setter
	public int getType_b() {
		return type_b;
	}
	public void setType_b(int type_b) {
		this.type_b = type_b;
	}
	public int getCat_r() {
		return cat_r;
	}
	public void setCat_r(int cat_r) {
		this.cat_r = cat_r;
	}
	public int getCat_c() {
		return cat_c;
	}
	public void setCat_c(int cat_c) {
		this.cat_c = cat_c;
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
	public String getCont_b() {
		return cont_b;
	}
	public void setCont_b(String cont_b) {
		this.cont_b = cont_b;
	}
	public String getId_writer() {
		return id_writer;
	}
	public void setId_writer(String id_writer) {
		this.id_writer = id_writer;
	}
	public String getSearch() {
		return search;
	}
	public void setSearch(String search) {
		this.search = search;
	}
	
	// toString()
	@Override
	public String toString() {
		return "SearchDTO [type_b=" + type_b + ", cat_r=" + cat_r + ", cat_c=" + cat_c + ", cat_n=" + cat_n + ", title="
				+ title + ", cont_b=" + cont_b + ", id_writer=" + id_writer + ", search=" + search + "]";
	}
	
}
