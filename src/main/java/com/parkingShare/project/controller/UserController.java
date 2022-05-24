package com.parkingShare.project.controller;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import com.parkingShare.project.service.UserService;
import com.parkingShare.project.vo.UserVO;

@Controller
public class UserController {

	@Autowired
	UserService userService;
	
	@RequestMapping("/home")
	public UserVO home(@RequestBody UserVO userInfo, UserVO userVO, HttpSession session) throws Exception {
		
		String userHp = userInfo.getUserHp();
		
		userVO.setUserHp(userHp);
		
		userVO = userService.selectUserInfo(userVO);
		
		if(userVO.getUserIdx() == 0) {
			userService.insertUser(userVO);
			userVO = userService.selectUserInfo(userVO);
		}
		
		session.setAttribute("user", userVO);
		
		return userVO;
	}
	
	@RequestMapping("/")
	public String index(HttpSession session) throws Exception {
		
		
		return "index.html";
	}
	
	
}
