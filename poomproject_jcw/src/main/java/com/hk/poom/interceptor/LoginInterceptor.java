package com.hk.poom.interceptor;

import java.io.IOException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

import com.hk.poom.dto.LoginDTO;


public class LoginInterceptor extends HandlerInterceptorAdapter {
	
	@Override
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws IOException {
		System.out.println("-------------------- PoomInterceptor_preHandle 실행 --------------------");
	
		// 처음 요청받은 url
		// ( request에서 받았다가... 그걸 다시 response해서 보이지 않게 숨겨놓고... 다시 request로 찾아오고...? )
		StringBuffer firstUrl = request.getRequestURL();
		System.out.println("처음 요청받은 url = " + firstUrl);
		request.setAttribute("firstUrl", firstUrl);
		
		// 요청한 브라우저의 session을 가져옴
		HttpSession session = request.getSession();
		
		// session에 저장돼 있는 loginMember를 가져옴
		LoginDTO loginMember = (LoginDTO) session.getAttribute("loginMember");
		if ( loginMember==null ) {
			System.out.println("-------------------- 로그인 정보 없음 --------------------");
			
//			// 저장한 url 보내주기
//			response.flushBuffer();
			
			// 브라우저한테 /auth/login으로 가라고 응답
			response.sendRedirect("/poom/login");
			
			return false;	// 더이상 컨트롤러 요청으로 가지 않도록...
		} else {
			System.out.println("-------------------- 로그인 정보 있음 --------------------");
			
			return true;
		}
	}

}
