package com.parkingShare.project.service;

import java.util.List;

import com.parkingShare.project.vo.ChattingVO;

public interface ChattingService {

	//채팅방 목록
	List<ChattingVO> selectChattingroomList(ChattingVO chattingVO) throws Exception;
	
	//채팅 상세보기
	List<ChattingVO> selectChattingList(ChattingVO chattingVO) throws Exception;
}

