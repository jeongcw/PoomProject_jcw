package com.hk.poom.service;

import javax.mail.internet.MimeMessage;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.stereotype.Service;

import com.hk.poom.dto.EmailCheck;
import com.hk.poom.mapper.MemberMapper;

@Service
public class EmailService {
	
	@Autowired 
	MemberMapper memberMapper;
	
	public final JavaMailSender javaMailSender;
	
	public EmailService(JavaMailSender javaMailSender) {
	      this.javaMailSender = javaMailSender;
	   }
	   
	   public boolean send(String subject, String text, String from, String to) {
	      MimeMessage message = javaMailSender.createMimeMessage();
	      
	      try {
	         MimeMessageHelper helper = new MimeMessageHelper(message, true, "UTF-8");
	         helper.setSubject(subject);
	         helper.setText(text);
	         helper.setFrom(from);
	         helper.setTo(to);
	         
	         javaMailSender.send(message);
	         return true;
	      } catch (Exception e) {
	         e.printStackTrace();
	      }
	      return false;
	   }
	   
	   public int addEmailCheck(EmailCheck emailCheck) {
		      return memberMapper.addEmailCheck(emailCheck);
	   }
	   
	   public String getDbCode(String email) {
		   return memberMapper.getDbCode(email);
	   }


}
