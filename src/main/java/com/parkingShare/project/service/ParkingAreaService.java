package com.parkingShare.project.service;

import java.util.List;

import com.parkingShare.project.vo.ParkingAreaVO;

public interface ParkingAreaService {

	//�������� ���
	List<ParkingAreaVO> selectParkingAreaList() throws Exception;
	
	//�������� �󼼺���
	ParkingAreaVO selectParkingAreaDetail(ParkingAreaVO parkingAreaVO) throws Exception;
	
	//�������� �߰�
	int insertParkingArea(ParkingAreaVO parkingAreaVO) throws Exception;
	
	//�������� ����
	int updateParkingArea(ParkingAreaVO parkingAreaVO) throws Exception;
	
	//�������� ���º���
	int updateParkingAreaStatement(ParkingAreaVO parkingAreaVO) throws Exception;
}

