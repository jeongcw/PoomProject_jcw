package com.hk.poom.controller;


import java.io.File;
import java.io.IOException;
import java.io.InputStream;

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

import com.hk.poom.dto.FindIdDTO;
import com.hk.poom.dto.LoginDTO;
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
		
		
		return "member/registerCom";
	}
	
	@PostMapping("/poom/register/com")
	public String registerComPost( ) {
		
		
		return "member/registerComPost";
	}
	
	
	
	@GetMapping("/poom/register/per")
	public String registerPer( ) {
		
		
		return "member/registerPer";
	}
	
	@GetMapping("/poom/register/new")
	public String registerNew( ) {
		logger.info("MemberController_Get_/poom/register/new 실행");
		
		return "member/registerNew";
	}
	
	@PostMapping("/poom/register/new")
	public String registerNewPost( Model model, RegisterPerDTO registerPerDTO, @RequestParam("prof") MultipartFile prof, @RequestParam("name") String name ) throws IOException {
		logger.info("MemberController_Post_/poom/register/new 실행");
		logger.info("신규 개인 회원 입력 정보 = " + registerPerDTO.toString());
		logger.info("프로필  파일 이름 = " + prof.getOriginalFilename());
		
		// 회원 정보 저장
		memberService.memberRegisterPer(registerPerDTO);
		model.addAttribute("name", name);
		
		// import java.io
		// sc.getRealPath : browser deployment location에서 project명까지의 경로
		File targetFile = new File(sc.getRealPath("/resources/fileupload/") + prof.getOriginalFilename());
		logger.info("파일의 실제 저장 위치(실행 디렉토리) = " + targetFile);
			
		try {
			// import java.io
			// 소스 디렉토리에 저장된 파일을 실행 디렉토리에 복사하라는 명령?
			InputStream fileStream = prof.getInputStream();
			FileUtils.copyInputStreamToFile(fileStream, targetFile);
		} catch (Exception e) {
			FileUtils.deleteQuietly(targetFile);
			e.printStackTrace();
		}
		
		// jsp에서 해당 이미지를 출력할 수 있게.. /resources로 시작하는 경로를 model에 저장해놓기
		model.addAttribute("imgSrc", "/resources/fileupload/" + prof.getOriginalFilename());
		
//		if ( prof!=null ) {
//			// jsp에서 해당 이미지를 출력할 수 있게.. /resources로 시작하는 경로를 model에 저장해놓기
//			model.addAttribute("imgSrc", "/resources/fileupload/" + prof.getOriginalFilename());
//	    } else {
//	    	model.addAttribute("imgSrc", "/resources/img/baseProf.png");
//	    }
		
		
		
		/*
//		// 프로필 사진 저장
//		String profUrl = memberService.profRestore(prof);
//		model.addAttribute("profUrl", profUrl);
		
//		// 파일 업로드
//		// sc.getRealPath : browser deployment location에서 project명까지의 경로
//		File profUrl = new File(sc.getRealPath("/resources/img/") + prof.getOriginalFilename());
//		logger.info("파일의 실제 저장 위치(실행 디렉토리) = " + profUrl);
//		
//		try {
//			// 소스 디렉토리에 저장된 파일을 실행 디렉토리에 복사하라는 명령?
//			InputStream fileStream = prof.getInputStream();
//			FileUtils.copyInputStreamToFile(fileStream, profUrl);
//		} catch (Exception e) {
//			FileUtils.deleteQuietly(profUrl);
//			e.printStackTrace();
//		}
//		
//		// jsp에서 해당 이미지를 출력할 수 있게.. /resources로 시작하는 경로를 model에 저장해놓기
//		model.addAttribute("imgSrc", "/resources/img/" + prof.getOriginalFilename());
		
		
		
		// .getRealPath : browser deployment location에서 project명까지의 경로
		// String savePath = "D:/Projects/workspace/projectName/WebContent/folderName";
		String savePath = sc.getRealPath("/resources/img/"); // 파일이 저장될 프로젝트 안의 폴더 경로
		// 파일 정보
	    String profFileFullName = prof.getOriginalFilename(); // 파일명.확장자
	    String profOnlyFileName = profFileFullName.substring(0, profFileFullName.indexOf(".")); // 파일명
	    String profExtName = profFileFullName.substring(profFileFullName.indexOf(".")); // 확장자
	    Long size = prof.getSize();	// 사이즈
	    
	    // DB에 저장될 파일이름 (앞에 날짜 추가)
	    Calendar calendar = Calendar.getInstance();
	    String dbSaveName = "";
	    dbSaveName += calendar.get(Calendar.YEAR);
	    dbSaveName += calendar.get(Calendar.MONTH);
	    dbSaveName += calendar.get(Calendar.DATE);
	    dbSaveName += calendar.get(Calendar.HOUR);
	    dbSaveName += calendar.get(Calendar.MINUTE);
	    dbSaveName += calendar.get(Calendar.SECOND);
	    dbSaveName += calendar.get(Calendar.MILLISECOND);
	    //dbSaveName += profFileFullName;
	    //String fullPath = savePath + "\\" + dbSaveName;
	    
//		// 저장된 파일을 jsp에서 부를때 경로
//		String profPath = sc.getRealPath("/resources/img/");
//		public String profRestore( MultipartFile prof ) throws IOException {
//			String profUrl = null;
//			
//			writeFile(prof, dbFileName);
//			profUrl = PREFIX_URL + dbFileName;
//			memberMapper.profRestore( profUrl );
//			return profUrl;
//		}
	    
	    if ( prof!=null ) {
	        try {
	            byte[] bytes = prof.getBytes();
	            FileOutputStream fos = new FileOutputStream(savePath + "/" + dbSaveName);
	            fos.write(bytes);
	            fos.close();
	            model.addAttribute("resultMsg", dbSaveName += profFileFullName);
	        } catch (Exception e) {
	            model.addAttribute("resultMsg", "파일을 업로드하는 데에 실패했습니다.");
	        }
	    } else {
	        model.addAttribute("resultMsg", "baseProf.png");
	    }
	     
//	    return "jspPage";




	//	
//		// 파일을 실제로 write 하는 메서드
//		private boolean writeFile(MultipartFile multipartFile, String dbFileName) throws IOException{
//			boolean result = false;
//			
//			return result;
//		}
		
		
		*/
		return "member/registerNewPost";
	}
	
	
	@GetMapping("/poom/login")
	public String login( ) {
		logger.info("MemberController_Get_/poom/login 실행");
		
		return "member/login";
	}
	
	@PostMapping("/poom/login")
	public String loginPost( HttpServletRequest request, HttpSession session, LoginDTO loginDTO ) {
		logger.info("MemberController_Post_/poom/login 실행");
		logger.info("로그인할 member = " + loginDTO.toString());
		
		LoginDTO loginMember = memberService.memberLogin( loginDTO );
		if ( loginMember!= null ) {
			logger.info("로그인 성공");
			
			session.setAttribute("loginMember", loginMember);
			
			//로그인 성공시 홈으로
			return "home";
		} else {
			logger.info("로그인 실패");
			
			//로그인 실패시
			return "member/loginFail";
		}
		
	}
	
	@GetMapping("/poom/logout")
	public String logout( HttpSession session ) {
		logger.info("MemberController_Get_/poom/logout 실행");
		
		session.invalidate();
		
		return "member/logout";
	}
	
	
	@GetMapping("/poom/find/id")
	public String findId( ) {
		
		
		return "member/findId";
	}
	
	
	@PostMapping("/poom/find/id")
	public String findIdPost( Model model, FindIdDTO findIdDTO) {
		
		model.addAttribute("findIdDTO", memberService.memberFindId(findIdDTO));
		return "member/findIdPost";
	}
	
	@GetMapping("/poom/find/pwd")
	public String findPwd( ) {
		
		
		return "member/findPwd";
	}
	

}
