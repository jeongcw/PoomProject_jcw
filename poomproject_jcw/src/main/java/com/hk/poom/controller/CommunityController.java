package com.hk.poom.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class CommunityController {
	
	@GetMapping("/poom/community/list")
	public String communityList( ) {
		
		return "community/communityList";
	}
	
	@GetMapping("/poom/community/read")
	public String community( ) {
		
		
		return "community/communityRead";
	}
	
	
	@PostMapping("/poom/community/read")
	public String communityReadPost( ) {
		
		
		return "community/communityReadPost";
	}
	
	@GetMapping("/poom/community/add")
	public String communityAdd( ) {
		
		
		return "community/communityAdd";
	}
	
	
	@PostMapping("/poom/community/add")
	public String communityAddPost( ) {
		
		
		return "community/communityAddPost";
	}
	
	@GetMapping("/poom/community/update")
	public String communityUpdate( ) {
		
		
		return "community/communityUpdate";
	}
	
	
	@PostMapping("/poom/community/update")
	public String communityUpdatePost( ) {
		
		
		return "community/communityUpdatePost";
	}
	
	@GetMapping("/poom/community/delete")
	public String communityDelete( ) {
		
		
		return "community/communityDelete";
	}
	
	
	@PostMapping("/poom/community/delete")
	public String communityDeletePost( ) {
		
		
		return "community/communityList";
	}
	
	
	

}
