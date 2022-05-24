package com.parkingShare.controller;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import com.parkingShare.service.UserService;
import com.parkingShare.vo.UserVO;

@Controller
public class UserController {

	@Autowired
	UserService userService;
	
	@RequestMapping(value = "/")
	public String home(@RequestBody UserVO userInfo, UserVO userVO, HttpSession session) throws Exception {
		
//		String userHp = userInfo.getUserHp();
//		
//		userVO.setUserHp(userHp);
//		
//		userVO = userService.selectUserInfo(userVO);
//		
//		if(userVO.getUserIdx() == 0) {
//			userService.insertUser(userVO);
//			userVO = userService.selectUserInfo(userVO);
//		}
//		
//		session.setAttribute("user", userVO);
		
		return "test";
	}
	
	
}
