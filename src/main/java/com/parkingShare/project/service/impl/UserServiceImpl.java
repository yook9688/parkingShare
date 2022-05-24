package com.parkingShare.project.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.parkingShare.project.dao.UserMapper;
import com.parkingShare.project.service.UserService;
import com.parkingShare.project.vo.UserVO;

@Service
public class UserServiceImpl implements UserService {
	
	@Autowired
	UserMapper userMapper;
	
	/**
	 * 사용자 정보 조회
	 * 
	 */
	@Override
	public UserVO selectUserInfo(UserVO userVO) throws Exception {
		return userMapper.selectUserInfo(userVO);
	}
	
	/**
	 * 사용자 정보 조회
	 * 
	 */
	@Override
	public void insertUser(UserVO userVO) throws Exception {
		userMapper.insertUser(userVO);
	}

	


	
}
