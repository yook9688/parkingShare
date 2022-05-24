package com.parkingShare.project.service;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.parkingShare.project.vo.ChattingVO;
import com.parkingShare.project.vo.ParkingAreaVO;

@Mapper
public interface ChattingService {

	//ä�ù� ���
	List<ChattingVO> selectChattingroomList(ChattingVO chattingVO) throws Exception;
	
	//ä�� �󼼺���
	List<ChattingVO> selectChattingList(ChattingVO chattingVO) throws Exception;
}

