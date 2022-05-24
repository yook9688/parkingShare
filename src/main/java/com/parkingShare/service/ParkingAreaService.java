package com.parkingShare.service;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.parkingShare.vo.ParkingAreaVO;

@Mapper
public interface ParkingAreaService {

	//�������� ���
	List<ParkingAreaVO> selectParkingAreaList() throws Exception;
	
	//�������� �󼼺���
	ParkingAreaVO selectParkingAreaDetail(ParkingAreaVO parkingAreaVO) throws Exception;
	
	//�������� ���º���
	int updateParkingAreaStatement(ParkingAreaVO parkingAreaVO) throws Exception;
}

