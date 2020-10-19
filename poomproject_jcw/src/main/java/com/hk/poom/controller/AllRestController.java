package com.hk.poom.controller;

import java.util.Random;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.hk.poom.dto.EmailCheck;
import com.hk.poom.dto.FindIdDTO;
import com.hk.poom.dto.LoginDTO;
import com.hk.poom.service.EmailService;
import com.hk.poom.service.MemberService;

@RestController
@RequestMapping(value="/poom", produces="text/plain;charset=UTF-8")
public class AllRestController {

	private static final Logger logger = LoggerFactory.getLogger(MemberController.class);

	@Autowired
	MemberService memberService;
	
	@Autowired
	EmailService emailService;
	
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
	
	// 이메일 보내기 관련 
	@PostMapping(path="/createEmailCheck", produces=MediaType.APPLICATION_JSON_VALUE)
	public boolean sendMail(EmailCheck emailCheck) {
			
		int randomCode = new Random().nextInt(10000)+1000; //인증코드 랜덤 만든거
		String joinCode = String.valueOf(randomCode); //집어넣은거 
		emailCheck.setCode(joinCode); //이메일체크 빈통에 setCode로 joinCode를 넣음
		      
		 System.out.println("EmailCheck vo는"+emailCheck);
		 String email = emailCheck.getEmail(); //이메일 체크빈통에 이메일을 뺀 사용자가 친 이메일이 들어감
		      
		 System.out.println("email은"+ email);
	      
		      
		      
		 emailService.addEmailCheck(emailCheck);


		 String subject = "회원가입을 위한 인증 이메일 입니다."; //제목
		 StringBuilder sb = new StringBuilder(); // 본문내용
		 sb.append("이메일 인증번호는").append(joinCode).append("입니다."); //본문내용
		 return emailService.send(subject, sb.toString(), "ydp12341234@gmail.com", email);

	}
		
	//코드 체크
	@PostMapping(path="/checkCode11", produces=MediaType.APPLICATION_JSON_VALUE)
	public String checkCode(Model model, @RequestParam("email") String email, @RequestParam("checkCode") String checkCode) {
		 String dbJoinCode = emailService.getDbCode(email); //DB저장된 코드를 불러온다  email로 던저서 DB같다온거고 
		 if(checkCode.equals(dbJoinCode)) { //checkCode == dbJoinCode같을때 0반환 
			 return "0";
		 } else {
		     return "1";
		 }
		      
		}

}
