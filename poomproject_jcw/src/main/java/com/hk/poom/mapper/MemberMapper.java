package com.hk.poom.mapper;

import org.springframework.stereotype.Repository;
import org.springframework.web.multipart.MultipartFile;

import com.hk.poom.dto.EmailCheck;
import com.hk.poom.dto.FindIdDTO;
import com.hk.poom.dto.FindPwdDTO;
import com.hk.poom.dto.LoginDTO;
import com.hk.poom.dto.ProfUploadDTO;
import com.hk.poom.dto.RegisterComDTO;
import com.hk.poom.dto.RegisterPerDTO;

@Repository
public interface MemberMapper {

	public LoginDTO memberLogin( LoginDTO loginDTO );
	public String profGet( int mno );
	public int memberRegisterPer( RegisterPerDTO registerPerDTO );
	public int memberRegisterCom( RegisterComDTO registerComDTO );
	public LoginDTO idDupChk( String id );
	public LoginDTO emailDupChk( String email );
	public int profUpload( ProfUploadDTO profUploadDTO );
	public FindIdDTO memberFindId( FindIdDTO findIdDTO );
	public FindPwdDTO memberFindPwd( FindPwdDTO findPwdDTO );
	public int addEmailCheck(EmailCheck emailCheck);
	public String getDbCode(String email);
	public int memberPwdUpdate(FindPwdDTO findPwdDTO);
	
}
