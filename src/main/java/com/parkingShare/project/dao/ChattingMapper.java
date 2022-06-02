package com.parkingShare.project.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.parkingShare.project.vo.ChattingVO;

@Mapper
public interface ChattingMapper {

	//ä�ù� ���
	List<ChattingVO> selectChattingroomList(ChattingVO chattingVO) throws Exception;
	
	//ä�� �󼼺���
	List<ChattingVO> selectChattingList(ChattingVO chattingVO) throws Exception;
}

