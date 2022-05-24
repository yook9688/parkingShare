package com.parkingShare.service;

import org.apache.ibatis.annotations.Mapper;

import com.parkingShare.vo.UserVO;

@Mapper
public interface UserService {
	
	//����� ������ȸ
	UserVO selectUserInfo(UserVO userVO) throws Exception;
	
	//����� �߰�
	void insertUser(UserVO userVO) throws Exception;
}

