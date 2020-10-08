package com.hk.poom.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class AdminController {
	
	@GetMapping("/poom/notice/list")
	public String noticeList( ) {
		
		System.out.println("들어오는지");
		return "admin/noticeList";
	}
	
	@GetMapping("/poom/notice/read")
	public String noticeRead( ) {
		
		
		return "admin/noticeRead";
	}
	
	
	@PostMapping("/poom/notice/read")
	public String noticeReadPost( ) {
		
		
		return "admin/noticeReadPost";
	}
	
	@GetMapping("/poom/admin/notice/add")
	public String noticeAdd( ) {
		
		
		return "admin/noticeAdd";
	}
	
	
	@PostMapping("/poom/admin/notice/add")
	public String noticeAddPost( ) {
		
		
		return "admin/noticeAddPost";
	}
	
	@GetMapping("/poom/admin/notice/update")
	public String noticeUpdate( ) {
		
		
		return "admin/noticeUpdate";
	}
	
	
	@PostMapping("/poom/admin/notice/update")
	public String noticeUpdatePost( ) {
		
		
		return "admin/noticeUpdatePost";
	}
	
	@GetMapping("/poom/admin/notice/delete")
	public String noticeDelete( ) {
		
		
		return "admin/noticeDelete";
	}
	
	
	@PostMapping("/poom/admin/notice/delete")
	public String noticeDeletePost( ) {
		
		
		return "admin/noticeList";
	}
	
	@GetMapping("/poom/admin")
	public String admin( ) {
		
		return "admin/admin";
	}
	
	@PostMapping("/poom/admin")
	public String adminPost( ) {
		
		return "admin/adminPost";
	}
	
	@GetMapping("/poom/admin/pay")
	public String adminPay( ) {
		
		return "admin/adminPay";
	}
	
	@PostMapping("/poom/admin/pay")
	public String adminPayPost( ) {
		
		return "admin/adminPayPost";
	}
	
	

}
