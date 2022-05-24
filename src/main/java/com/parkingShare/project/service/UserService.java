package com.parkingShare.project.service;

import org.apache.ibatis.annotations.Mapper;

import com.parkingShare.project.vo.UserVO;

@Mapper
public interface UserService {
	
	//����� ������ȸ
	UserVO selectUserInfo(UserVO userVO) throws Exception;
	
	//����� �߰�
	void insertUser(UserVO userVO) throws Exception;
}

