package com.parkingShare.project.controller;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.parkingShare.project.service.UserService;
import com.parkingShare.project.vo.UserVO;

@RestController
public class UserController {

	@Autowired
	UserService userService;
	
	@RequestMapping("/home")
	public String home(@RequestBody UserVO userInfo, UserVO userVO, HttpSession session) throws Exception {
		
		String userHp = userInfo.getUserHp();
		
		
		userVO.setUserHp(userHp);
		UserVO checkUser = userService.selectUserInfo(userVO);
		
		if(checkUser == null) {
			String userType = userInfo.getUserType();
			userVO.setUserType(userType);
			userService.insertUser(userVO);
			userVO = userService.selectUserInfo(userVO);
		}
		
		session.setAttribute("user", userVO);
		
		return "index.html";
		
	}
	
	@RequestMapping("/")
	public String index(HttpSession session) throws Exception {
		
		
		return "index.html";
	}
	
	
}
