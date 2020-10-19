package com.hk.poom.mapper;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.hk.poom.dto.CategoryDTO;
import com.hk.poom.dto.RehomeAddDTO;
import com.hk.poom.dto.RehomeListDTO;
import com.hk.poom.dto.RehomeReadDTO;
import com.hk.poom.dto.RehomeReportDTO;
import com.hk.poom.dto.RehomeUpdateDTO;

@Repository
public interface RehomeMapper {

	public List<RehomeAddDTO> rehomeList( );
	public RehomeUpdateDTO rehomeGetOne( int bno );
	public int rehomeUpdate( RehomeUpdateDTO rehomeUpdateDTO );
	public int rehomeUpdate1( RehomeUpdateDTO rehomeUpdateDTO );
	public int rehomeDelete( int bno );
	public RehomeReadDTO rehomeRead( int bno );
	public List<CategoryDTO> category();
	public int rehomeAddPost(RehomeAddDTO rehomeAddDTO);
	public String rehomeCateName( String cateCode );
	public int rehomeCateUpdate( RehomeAddDTO rehomeAddDTO );
	public RehomeReportDTO rehomeGetOne1( int bno );
	public int report(RehomeReportDTO report);
}
