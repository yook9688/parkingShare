package com.parkingShare.project.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;

import com.parkingShare.project.service.ChattingService;
import com.parkingShare.project.vo.ChattingVO;

@Controller
public class ChattingController {

	@Autowired
	ChattingService chattingService;
	
	@PostMapping(value = "chatting/roomList.do")
	public List<ChattingVO> selectChattingroomList(ChattingVO chattingVO) throws Exception {
		
		return chattingService.selectChattingroomList(chattingVO);
	}
	
	@PostMapping(value = "chatting/List.do")
	public List<ChattingVO> selectChattingList(ChattingVO chattingVO) throws Exception {
		
		return chattingService.selectChattingList(chattingVO);
	}
}
