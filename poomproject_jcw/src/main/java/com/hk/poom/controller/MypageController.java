package com.hk.poom.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class MypageController {
	
	@GetMapping("/poom/mypage")
	public String mypage( ) {
		
		
		return "mypage/mypage";
	}
	
	
	@PostMapping("/poom/mypage")
	public String mypagePost( ) {
		
		
		return "mypage/mypagePost";
	}
	
	@GetMapping("/poom/otherpage")
	public String otherpage( ) {
		
		return "mypage/otherpage";
	}

}
