package com.hk.poom.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.hk.poom.dto.FindIdDTO;
import com.hk.poom.dto.LoginDTO;
import com.hk.poom.service.MemberService;

@RestController
@RequestMapping(value="/poom", produces="text/plain;charset=UTF-8")
public class AllRestController {

	private static final Logger logger = LoggerFactory.getLogger(MemberController.class);

	@Autowired
	MemberService memberService;
	
	@PostMapping(path="/register/idDupChk", produces=MediaType.APPLICATION_JSON_VALUE)
	public int idDupChk(@RequestParam("id") String id) {
		//logger.info("AllRestController_Post_/poom/register/idDupChk 실행");
		
		//logger.info("Client에서 보내온 id = " + id);		
		LoginDTO idDupChkMember = memberService.idDupChk(id);
		if ( idDupChkMember==null ) {
			//logger.info("중복되는 ID 없음");
			return 0;
		} else {
			//logger.info("중복되는 ID 있음");
			return 1;
		}
		
	}
	
	@PostMapping(path="/register/emailDupChk", produces=MediaType.APPLICATION_JSON_VALUE)
	public int emailDupChk(@RequestParam("email") String email) {
		//logger.info("AllRestController_Post_/poom/register/emailDupChk 실행");
		
		//logger.info("Client에서 보내온 email = " + email);		
		LoginDTO emailDupChkMember = memberService.emailDupChk(email);
		if ( emailDupChkMember==null ) {
			//logger.info("중복되는 email 없음");
			return 0;
		} else {
			//logger.info("중복되는 email 있음");
			return 1;
		}
		
	}
	
	@PostMapping(path="/find/id", produces=MediaType.APPLICATION_JSON_VALUE)
	public String findIdPost(@RequestParam("name") String name, @RequestParam("email") String email) {
		//logger.info("AllRestController_Post_/poom/find/id 실행");
		
		//logger.info("Client에서 보내온 name, email = " + name + ", " + email);		
		FindIdDTO findId = new FindIdDTO();
		findId.setName(name);
		findId.setEmail(email);
		FindIdDTO memberFindId = memberService.memberFindId(findId);
		return memberFindId.getId();
	}

}
