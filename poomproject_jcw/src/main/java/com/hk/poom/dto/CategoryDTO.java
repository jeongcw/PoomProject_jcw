package com.hk.poom.dto;

public class CategoryDTO {

	
	String cateName;
	String cateCode;
	String cateCodeRef;
	int lv;
	public String getCateName() {
		return cateName;
	}
	public void setCateName(String cateName) {
		this.cateName = cateName;
	}
	public String getCateCode() {
		return cateCode;
	}
	public void setCateCode(String cateCode) {
		this.cateCode = cateCode;
	}
	public String getCateCodeRef() {
		return cateCodeRef;
	}
	public void setCateCodeRef(String cateCodeRef) {
		this.cateCodeRef = cateCodeRef;
	}		
	public int getLv() {
		return lv;
	}
	public void setLv(int lv) {
		this.lv = lv;
	}
	@Override
	public String toString() {
		return "CategoryDTO [cateName=" + cateName + ", cateCode=" + cateCode + ", cateCodeRef=" + cateCodeRef + ", lv="
				+ lv + "]";
	}
	
	
}
