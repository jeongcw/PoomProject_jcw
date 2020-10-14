package com.hk.poom.controller;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.apache.commons.io.FileUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import com.hk.poom.dto.LoginDTO;
import com.hk.poom.dto.ProfUploadDTO;
import com.hk.poom.dto.RegisterComDTO;
import com.hk.poom.dto.RegisterPerDTO;
import com.hk.poom.service.MemberService;



@Controller
public class MemberController {
	
	private static final Logger logger = LoggerFactory.getLogger(MemberController.class);

	@Autowired
	MemberService memberService;
	
	@Autowired
	ServletContext sc;
	
	@GetMapping("/poom/register/com")
	public String registerCom( ) {
		//logger.info("MemberController_Get_/poom/register/com 실행");
		
		return "member/registerCom";
	}
	
	@PostMapping("/poom/register/com")
	public String registerComPost( Model model, RegisterComDTO registerComDTO, @RequestParam("prof") MultipartFile prof, @RequestParam("name") String name ) {
		//logger.info("MemberController_Post_/poom/register/com 실행");
		//logger.info("신규 개인 회원 입력 정보 = " + registerComDTO.toString());
		
		// 입력받은 회원 정보 저장
		memberService.memberRegisterCom(registerComDTO);
		model.addAttribute("name", name);
		
		// 업로드한 프로필 파일 저장
		// 1) 업로드 시간으로 파일 이름 수정하기 (for 파일명 중복 방지)
		//logger.info("업로드한 prof 파일 이름 = " + prof.getOriginalFilename());
		String nowTime = new SimpleDateFormat("yyyyMMddHmsS").format(new Date());
		//logger.info("nowTime = " + nowTime);
	    // sc.getRealPath : browser deployment location에서 project명까지의 경로  (D:\SRC_Spring\.metadata\.plugins\org.eclipse.wst.server.core\tmp0\wtpwebapps\PoomProject-mini)
	 	String realPath = sc.getRealPath("/resources/prof/");
		String dbSaveName = "";
		if ( prof.isEmpty() ) {	// 회원 가입할 때 프로필 사진을 업로드하지 않음 -> 기본 이미지를 prof 아래에 넣어놓고, 그 파일명을 기본값으로 넣어줌
			dbSaveName = "baseProf.jpg";
		} else {	// 회원 가입할 때 프로필 사진을 업로드함
			dbSaveName = nowTime + prof.getOriginalFilename().substring(prof.getOriginalFilename().lastIndexOf("."));	// 업로드시간.확장자
			//logger.info("dbSaveName = " + dbSaveName);
			// File(String pathname) : pathname에 해당되는 파일의 File 객체를 생성한다.
		 	File oldProfFile = new File(realPath + prof.getOriginalFilename());	// 업로드한 파일이 실제로 저장되는 위치  + 파일명 (확장자 포함) => 실행 디렉토리
		    File newProfFile = new File(realPath + dbSaveName);
		    oldProfFile.renameTo(newProfFile);	// 파일명 변경
			//logger.info("newProfFile = " + newProfFile);
			try {
				// 소스 디렉토리에 저장된 파일을 실행 디렉토리에 복사하라는 명령?
				InputStream fileStream = prof.getInputStream();
				FileUtils.copyInputStreamToFile(fileStream, newProfFile);
			} catch (Exception e) {
				FileUtils.deleteQuietly(newProfFile);
				e.printStackTrace();
			}
		}
		// 2) 수정된 파일 이름으로 DB에 저장하기
		ProfUploadDTO profUploadDTO = new ProfUploadDTO();
		profUploadDTO.setMno(registerComDTO.getMno());
		profUploadDTO.setDbSaveName(dbSaveName);
		memberService.profUpload(profUploadDTO);
		// Post.jsp에서 해당 이미지를 출력할 수 있게.. /resources로 시작하는 경로를 model에 저장해놓기
		model.addAttribute("prof", "/resources/prof/" + dbSaveName);
		
		return "member/registerComPost";
	}
	
	
	
	@GetMapping("/poom/register/per")
	public String registerPer( ) {
		//logger.info("MemberController_Get_/poom/register/per 실행");
		
		return "member/registerPer";
	}
	
	
	@GetMapping("/poom/register/new")
	public String registerNew( ) {
		//logger.info("MemberController_Get_/poom/register/new 실행");
		
		return "member/registerNew";
	}
	
	@PostMapping("/poom/register/new")
	public String registerNewPost( Model model, RegisterPerDTO registerPerDTO, @RequestParam("prof") MultipartFile prof, @RequestParam("name") String name ) throws IOException {
		//logger.info("MemberController_Post_/poom/register/new 실행");
		//logger.info("신규 개인 회원 입력 정보 = " + registerPerDTO.toString());
		
		// 입력받은 회원 정보 저장
		memberService.memberRegisterPer(registerPerDTO);
		model.addAttribute("name", name);
		
		// 업로드한 프로필 파일 저장
		// 1) 업로드 시간으로 파일 이름 수정하기 (for 파일명 중복 방지)
		//logger.info("업로드한 prof 파일 이름 = " + prof.getOriginalFilename());
		String nowTime = new SimpleDateFormat("yyyyMMddHmsS").format(new Date());
		//logger.info("nowTime = " + nowTime);
	    // sc.getRealPath : browser deployment location에서 project명까지의 경로  (D:\SRC_Spring\.metadata\.plugins\org.eclipse.wst.server.core\tmp0\wtpwebapps\PoomProject-mini)
	 	String realPath = sc.getRealPath("/resources/prof/");
		String dbSaveName = "";
		if ( prof.isEmpty() ) {	// 회원 가입할 때 프로필 사진을 업로드하지 않음 -> 기본 이미지를 prof 아래에 넣어놓고, 그 파일명을 기본값으로 넣어줌
			dbSaveName = "baseProf.jpg";
		} else {	// 회원 가입할 때 프로필 사진을 업로드함
			dbSaveName = nowTime + prof.getOriginalFilename().substring(prof.getOriginalFilename().lastIndexOf("."));	// 업로드시간.확장자
			//logger.info("dbSaveName = " + dbSaveName);
			// File(String pathname) : pathname에 해당되는 파일의 File 객체를 생성한다.
		 	File oldProfFile = new File(realPath + prof.getOriginalFilename());	// 업로드한 파일이 실제로 저장되는 위치  + 파일명 (확장자 포함) => 실행 디렉토리
		    File newProfFile = new File(realPath + dbSaveName);
		    oldProfFile.renameTo(newProfFile);	// 파일명 변경
			//logger.info("newProfFile = " + newProfFile);
			try {
				// 소스 디렉토리에 저장된 파일을 실행 디렉토리에 복사하라는 명령?
				InputStream fileStream = prof.getInputStream();
				FileUtils.copyInputStreamToFile(fileStream, newProfFile);
			} catch (Exception e) {
				FileUtils.deleteQuietly(newProfFile);
				e.printStackTrace();
			}
		}
		// 2) 수정된 파일 이름으로 DB에 저장하기
		ProfUploadDTO profUploadDTO = new ProfUploadDTO();
		profUploadDTO.setMno(registerPerDTO.getMno());
		profUploadDTO.setDbSaveName(dbSaveName);
		memberService.profUpload(profUploadDTO);
		// Post.jsp에서 해당 이미지를 출력할 수 있게.. /resources로 시작하는 경로를 model에 저장해놓기
		model.addAttribute("prof", "/resources/prof/" + dbSaveName);

		return "member/registerNewPost";
	}
	
	
	@GetMapping("/poom/login")
	public String login( ) {
		//logger.info("MemberController_Get_/poom/login 실행");
		
		return "member/login";
	}
	
	@PostMapping("/poom/login")
	public String loginPost( HttpServletRequest request, HttpSession session, LoginDTO loginDTO ) {
		//logger.info("MemberController_Post_/poom/login 실행");
		//logger.info("로그인할 member = " + loginDTO.toString());
		
		LoginDTO loginMember = memberService.memberLogin( loginDTO );
		if ( loginMember!= null ) {
			//logger.info("로그인 성공");
			
			session.setAttribute("loginMember", loginMember);
			// 로그인한 사람의 prof (db에 저장된 파일명을 가져옴)
			session.setAttribute("prof", memberService.profGet(loginMember.getMno()));
			
			//로그인 성공시 홈으로
			return "home";
		} else {
			//logger.info("로그인 실패");
			
			//로그인 실패시
			return "member/loginFail";
		}
		
	}
	
	@GetMapping("/poom/logout")
	public String logout( HttpSession session ) {
		//logger.info("MemberController_Get_/poom/logout 실행");
		
		session.invalidate();
		
		return "member/logout";
	}
	
	
	@GetMapping("/poom/find/id")
	public String findId( ) {
		
		
		return "member/findId";
	}
	
	
//	@PostMapping("/poom/find/id")
//	public String findIdPost( Model model, FindIdDTO findIdDTO ) {
//		
//		model.addAttribute("findIdDTO", memberService.memberFindId(findIdDTO));
//		return "member/findIdPost";
//	}
	
	@GetMapping("/poom/find/pwd")
	public String findPwd( ) {
		
		
		return "member/findPwd";
	}
	

}
