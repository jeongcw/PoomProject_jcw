package com.hk.poom.mapper;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.hk.poom.dto.AdminPayDTO;
import com.hk.poom.dto.NoticeAddDTO;
import com.hk.poom.dto.NoticeListDTO;
import com.hk.poom.dto.NoticeReadDTO;
import com.hk.poom.dto.NoticeUpdateDTO;

@Repository
public interface AdminMapper {
	
	public List<NoticeListDTO> noticeList( );
	public int noticeAdd( NoticeAddDTO noticeAddDTO );
	public NoticeAddDTO noticeGetOne( int bno );
	public int noticeUpdate( NoticeUpdateDTO noticeUpdateDTO );
	public int noticeRead( NoticeReadDTO noticeReadDTO );
	public int noticeDelete( int bno );
	public List<AdminPayDTO> adminPay( );

}
