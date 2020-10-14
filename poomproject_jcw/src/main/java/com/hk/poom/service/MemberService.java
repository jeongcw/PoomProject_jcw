package com.hk.poom.service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hk.poom.dto.FindIdDTO;
import com.hk.poom.dto.FindPwdDTO;
import com.hk.poom.dto.LoginDTO;
import com.hk.poom.dto.ProfUploadDTO;
import com.hk.poom.dto.RegisterComDTO;
import com.hk.poom.dto.RegisterPerDTO;
import com.hk.poom.mapper.MemberMapper;

@Service
public class MemberService {

	@Autowired 
	MemberMapper memberMapper;
	

	public LoginDTO memberLogin( LoginDTO loginDTO ) {
		return memberMapper.memberLogin( loginDTO );
	}
	
	public String profGet( int mno ) {
		return memberMapper.profGet( mno );
	}

	public int memberRegisterPer( RegisterPerDTO registerPerDTO ) {
		int retVal = memberMapper.memberRegisterPer( registerPerDTO );
		return retVal;
	}
	
	public int memberRegisterCom( RegisterComDTO registerComDTO ) {
		int retVal = memberMapper.memberRegisterCom( registerComDTO );
		return retVal;
	}

	public LoginDTO idDupChk( String id ) {
		return memberMapper.idDupChk( id );
	}
	
	public LoginDTO emailDupChk( String email ) {
		return memberMapper.emailDupChk( email );
	}

	public FindIdDTO memberFindId( FindIdDTO findIdDTO ) {
		return memberMapper.memberFindId( findIdDTO );
	}
	
	public int profUpload( ProfUploadDTO profUploadDTO ) {
		int retVal = memberMapper.profUpload( profUploadDTO );
		return retVal;
	}
	
	public FindPwdDTO memberFindPwd( FindPwdDTO findPwdDTO ) {
		return memberMapper.memberFindPwd( findPwdDTO );
	}

}
