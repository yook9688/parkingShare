package com.parkingShare.project.service;

import com.parkingShare.project.vo.UserVO;

public interface UserService {
	
	//����� ������ȸ
	UserVO selectUserInfo(UserVO userVO) throws Exception;
	
	//����� �߰�
	void insertUser(UserVO userVO) throws Exception;
}

