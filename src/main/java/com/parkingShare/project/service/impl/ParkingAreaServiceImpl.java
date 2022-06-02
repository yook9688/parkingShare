package com.parkingShare.project.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.parkingShare.project.dao.ParkingAreaMapper;
import com.parkingShare.project.service.ParkingAreaService;
import com.parkingShare.project.vo.ParkingAreaVO;

@Service
public class ParkingAreaServiceImpl implements ParkingAreaService {
	
	@Autowired
	ParkingAreaMapper parkingAreaMapper;

	/**
	 * 林瞒备开 格废 炼雀
	 * 
	 */
	@Override
	public List<ParkingAreaVO> selectParkingAreaList() throws Exception {
		return parkingAreaMapper.selectParkingAreaList();
	}

	/**
	 * 林瞒备开 惑技炼雀
	 * 
	 */
	@Override
	public ParkingAreaVO selectParkingAreaDetail(ParkingAreaVO parkingAreaVO) throws Exception {
		return parkingAreaMapper.selectParkingAreaDetail(parkingAreaVO);
	}
	
	
	/**
	 * 林瞒备开 眠啊
	 * 
	 */
	@Override
	public int insertParkingArea(ParkingAreaVO parkingAreaVO) throws Exception {
		
		return parkingAreaMapper.insertParkingArea(parkingAreaVO);
	}
	
	/**
	 * 林瞒备开 荐沥
	 * 
	 */
	@Override
	public int updateParkingArea(ParkingAreaVO parkingAreaVO) throws Exception {
		
		return parkingAreaMapper.updateParkingArea(parkingAreaVO);
	}

	/**
	 * 林瞒备开 惑怕函版
	 * 
	 */
	@Override
	public int updateParkingAreaStatement(ParkingAreaVO parkingAreaVO) throws Exception {
		return parkingAreaMapper.updateParkingAreaStatement(parkingAreaVO);
	}

	
}
