package com.parkingShare.project.service;

import java.util.List;

import com.parkingShare.project.vo.ChattingVO;

public interface ChattingService {

	//ä�ù� ���
	List<ChattingVO> selectChattingroomList(ChattingVO chattingVO) throws Exception;
	
	//ä�� �󼼺���
	List<ChattingVO> selectChattingList(ChattingVO chattingVO) throws Exception;
}

