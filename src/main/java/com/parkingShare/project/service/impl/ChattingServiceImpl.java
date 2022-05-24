package com.parkingShare.project.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.parkingShare.project.dao.ChattingMapper;
import com.parkingShare.project.service.ChattingService;
import com.parkingShare.project.vo.ChattingVO;

@Service
public class ChattingServiceImpl implements ChattingService {
	
	@Autowired
	ChattingMapper chattingMapper;

	/**
	 * ä�ù� ��� ��ȸ
	 * 
	 */
	@Override
	public List<ChattingVO> selectChattingroomList(ChattingVO chattingVO) throws Exception {
		return chattingMapper.selectChattingroomList(chattingVO);
	}
	
	/**
	 * ä�ù� ��ȸ
	 * 
	 */
	@Override
	public List<ChattingVO> selectChattingList(ChattingVO chattingVO) throws Exception {
		return chattingMapper.selectChattingList(chattingVO);
	}

	
}
