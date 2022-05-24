package com.parkingShare.project.dao;

import org.apache.ibatis.annotations.Mapper;

import com.parkingShare.project.vo.UserVO;

@Mapper
public interface UserMapper {
	
	//����� ������ȸ
	UserVO selectUserInfo(UserVO userVO) throws Exception;
	
	//����� �߰�
	void insertUser(UserVO userVO) throws Exception;
}
