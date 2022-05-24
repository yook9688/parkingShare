package com.parkingShare.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.parkingShare.dao.ParkingAreaMapper;
import com.parkingShare.service.ParkingAreaService;
import com.parkingShare.vo.ParkingAreaVO;

@Service
public class ParkingAreaServiceImpl implements ParkingAreaService {
	
	@Autowired
	ParkingAreaMapper parkingAreaMapper;

	/**
	 * 주차구역 목록 조회
	 * 
	 */
	@Override
	public List<ParkingAreaVO> selectParkingAreaList() throws Exception {
		return parkingAreaMapper.selectParkingAreaList();
	}

	/**
	 * 주차구역 상세조회
	 * 
	 */
	@Override
	public ParkingAreaVO selectParkingAreaDetail(ParkingAreaVO parkingAreaVO) throws Exception {
		return parkingAreaMapper.selectParkingAreaDetail(parkingAreaVO);
	}
	
	/**
	 * 주차구역 상태변경
	 * 
	 */
	@Override
	public int updateParkingAreaStatement(ParkingAreaVO parkingAreaVO) throws Exception {
		return parkingAreaMapper.updateParkingAreaStatement(parkingAreaVO);
	}

	
}
