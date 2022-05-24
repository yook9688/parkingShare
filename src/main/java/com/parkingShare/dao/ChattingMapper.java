package com.parkingShare.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.parkingShare.vo.ChattingVO;
import com.parkingShare.vo.ParkingAreaVO;

@Mapper
public interface ChattingMapper {

	//채팅방 목록
	List<ChattingVO> selectChattingroomList(ChattingVO chattingVO) throws Exception;
	
	//채팅 상세보기
	List<ChattingVO> selectChattingList(ChattingVO chattingVO) throws Exception;
}

