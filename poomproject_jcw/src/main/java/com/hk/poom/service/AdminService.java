package com.hk.poom.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hk.poom.dto.AdminPayDTO;
import com.hk.poom.dto.NoticeAddDTO;
import com.hk.poom.dto.NoticeListDTO;
import com.hk.poom.dto.NoticeReadDTO;
import com.hk.poom.dto.NoticeUpdateDTO;
import com.hk.poom.mapper.AdminMapper;

@Service
public class AdminService {

	@Autowired
	AdminMapper adminMapper;

	
	public List<NoticeListDTO> noticeList( ) {
		return adminMapper.noticeList( );
	}

	public int NoticeAdd( NoticeAddDTO noticeAddDTO ) {
		int retVal = adminMapper.noticeAdd( noticeAddDTO );
		return retVal;
	}

	public NoticeAddDTO noticeGetOne( int bno ) {
		return adminMapper.noticeGetOne( bno );
	}

	public int noticeUpdate( NoticeUpdateDTO noticeUpdateDTO ) {
		int retVal = adminMapper.noticeUpdate( noticeUpdateDTO );
		return retVal;
	}

	public int noticeRead( NoticeReadDTO noticeReadDTO ) {
		int retVal = adminMapper.noticeRead( noticeReadDTO );
		return retVal;
	}

	public int noticeDelete( int bno ) {
		int retVal = adminMapper.noticeDelete( bno );
		return retVal;
	}

	public List<AdminPayDTO> adminPay( ) {
		return adminMapper.adminPay( );
	}
	
}
