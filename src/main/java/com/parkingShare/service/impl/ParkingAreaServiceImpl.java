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
	 * �������� ��� ��ȸ
	 * 
	 */
	@Override
	public List<ParkingAreaVO> selectParkingAreaList() throws Exception {
		return parkingAreaMapper.selectParkingAreaList();
	}

	/**
	 * �������� ����ȸ
	 * 
	 */
	@Override
	public ParkingAreaVO selectParkingAreaDetail(ParkingAreaVO parkingAreaVO) throws Exception {
		return parkingAreaMapper.selectParkingAreaDetail(parkingAreaVO);
	}
	
	/**
	 * �������� ���º���
	 * 
	 */
	@Override
	public int updateParkingAreaStatement(ParkingAreaVO parkingAreaVO) throws Exception {
		return parkingAreaMapper.updateParkingAreaStatement(parkingAreaVO);
	}

	
}
