package com.parkingShare.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.parkingShare.dao.UserMapper;
import com.parkingShare.service.UserService;
import com.parkingShare.vo.UserVO;

@Service
public class UserServiceImpl implements UserService {
	
	@Autowired
	UserMapper userMapper;
	
	/**
	 * ����� ���� ��ȸ
	 * 
	 */
	@Override
	public UserVO selectUserInfo(UserVO userVO) throws Exception {
		return userMapper.selectUserInfo(userVO);
	}
	
	/**
	 * ����� ���� ��ȸ
	 * 
	 */
	@Override
	public void insertUser(UserVO userVO) throws Exception {
		userMapper.insertUser(userVO);
	}

	


	
}
