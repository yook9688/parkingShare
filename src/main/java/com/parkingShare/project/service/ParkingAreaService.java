package com.parkingShare.project.service;

import java.util.List;

import com.parkingShare.project.vo.ParkingAreaVO;

public interface ParkingAreaService {

	//林瞒备开 格废
	List<ParkingAreaVO> selectParkingAreaList() throws Exception;
	
	//林瞒备开 惑技焊扁
	ParkingAreaVO selectParkingAreaDetail(ParkingAreaVO parkingAreaVO) throws Exception;
	
	//林瞒备开 眠啊
	int insertParkingArea(ParkingAreaVO parkingAreaVO) throws Exception;
	
	//林瞒备开 荐沥
	int updateParkingArea(ParkingAreaVO parkingAreaVO) throws Exception;
	
	//林瞒备开 惑怕函版
	int updateParkingAreaStatement(ParkingAreaVO parkingAreaVO) throws Exception;
}

