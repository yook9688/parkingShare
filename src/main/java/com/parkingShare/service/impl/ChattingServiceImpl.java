package com.parkingShare.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.parkingShare.dao.ChattingMapper;
import com.parkingShare.service.ChattingService;
import com.parkingShare.vo.ChattingVO;

@Service
public class ChattingServiceImpl implements ChattingService {
	
	@Autowired
	ChattingMapper chattingMapper;

	/**
	 * 채팅방 목록 조회
	 * 
	 */
	@Override
	public List<ChattingVO> selectChattingroomList(ChattingVO chattingVO) throws Exception {
		return chattingMapper.selectChattingroomList(chattingVO);
	}
	
	/**
	 * 채팅방 조회
	 * 
	 */
	@Override
	public List<ChattingVO> selectChattingList(ChattingVO chattingVO) throws Exception {
		return chattingMapper.selectChattingList(chattingVO);
	}

	
}
