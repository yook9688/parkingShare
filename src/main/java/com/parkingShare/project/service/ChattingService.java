package com.parkingShare.project.service;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.parkingShare.project.vo.ChattingVO;
import com.parkingShare.project.vo.ParkingAreaVO;

@Mapper
public interface ChattingService {

	//채팅방 목록
	List<ChattingVO> selectChattingroomList(ChattingVO chattingVO) throws Exception;
	
	//채팅 상세보기
	List<ChattingVO> selectChattingList(ChattingVO chattingVO) throws Exception;
}

