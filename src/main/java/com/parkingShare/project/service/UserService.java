package com.parkingShare.project.service;

import org.apache.ibatis.annotations.Mapper;

import com.parkingShare.project.vo.UserVO;

@Mapper
public interface UserService {
	
	//사용자 정보조회
	UserVO selectUserInfo(UserVO userVO) throws Exception;
	
	//사용자 추가
	void insertUser(UserVO userVO) throws Exception;
}

