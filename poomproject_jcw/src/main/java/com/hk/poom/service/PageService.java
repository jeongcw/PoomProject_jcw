package com.hk.poom.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hk.poom.dto.AdminPayDTO;
import com.hk.poom.dto.CommunityListDTO;
import com.hk.poom.dto.MypageBuyDTO;
import com.hk.poom.dto.MypageChatDTO;
import com.hk.poom.dto.MypageDTO;
import com.hk.poom.dto.MypageLikeDTO;
import com.hk.poom.dto.MypageSaleDTO;
import com.hk.poom.dto.MypageWriteDTO;
import com.hk.poom.dto.OtherpageDTO;
import com.hk.poom.mapper.PageMapper;

@Service
public class PageService {
	
	@Autowired
	PageMapper pageMapper;
	
	
	public MypageDTO mypage( int mno ) {
		return pageMapper.mypage( mno );
	}
	
	public List<MypageLikeDTO> mypageLikeList(  ) {
		return pageMapper.mypageLikeList(  );
	}
	
	public List<MypageSaleDTO> mypageSaleList( AdminPayDTO adminPayDTO ) {
		return pageMapper.mypageSaleList( adminPayDTO );
	}
	
	public List<MypageBuyDTO> mypageBuyList( AdminPayDTO adminPayDTO ) {
		return pageMapper.mypageBuyList( adminPayDTO );
	}
	
	public List<MypageWriteDTO> mypageWriteList( CommunityListDTO communityListDTO ) {
		return pageMapper.mypageWriteList( communityListDTO );
	}
	
	public List<MypageChatDTO> mypageChatList( MypageChatDTO mypageChatDTO ) {
		return pageMapper.mypageChatList( mypageChatDTO );
	}
	
	public MypageDTO mypageUpdate( MypageDTO mypageDTO ) {
		return pageMapper.mypageUpdate( mypageDTO );
	}
	
	public OtherpageDTO otherpage( int mno ) {
		return pageMapper.otherpage( mno );
	}
	
}
