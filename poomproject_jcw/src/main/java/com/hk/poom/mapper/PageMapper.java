package com.hk.poom.mapper;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.hk.poom.dto.AdminPayDTO;
import com.hk.poom.dto.CommunityListDTO;
import com.hk.poom.dto.MypageBuyDTO;
import com.hk.poom.dto.MypageChatDTO;
import com.hk.poom.dto.MypageDTO;
import com.hk.poom.dto.MypageLikeDTO;
import com.hk.poom.dto.MypageSaleDTO;
import com.hk.poom.dto.MypageWriteDTO;
import com.hk.poom.dto.OtherpageDTO;

@Repository
public interface PageMapper {
	
	public MypageDTO mypage( int mno );
	public List<MypageLikeDTO> mypageLikeList(  );
	public List<MypageSaleDTO> mypageSaleList( AdminPayDTO adminPayDTO );
	public List<MypageBuyDTO> mypageBuyList( AdminPayDTO adminPayDTO );
	public List<MypageWriteDTO> mypageWriteList( CommunityListDTO communityListDTO );
	public List<MypageChatDTO> mypageChatList( MypageChatDTO mypageChatDTO );
	public MypageDTO mypageUpdate( MypageDTO mypageDTO );
	public OtherpageDTO otherpage( int mno );
	
}
