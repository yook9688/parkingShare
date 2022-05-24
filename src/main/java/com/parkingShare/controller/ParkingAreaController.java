package com.parkingShare.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.parkingShare.service.ParkingAreaService;
import com.parkingShare.vo.ParkingAreaVO;

@Controller
public class ParkingAreaController {

	@Autowired
	ParkingAreaService parkingAreaService;
	
	@PostMapping(value = "parkingArea/list.do")
	public List<ParkingAreaVO> selectParkingAreaList() throws Exception {
		
		return parkingAreaService.selectParkingAreaList();
	}
	
	@PostMapping(value = "parkingArea/parkingAreaDetail.do")
	public ParkingAreaVO selectParkingAreaInfo(ParkingAreaVO parkingAreaVO) throws Exception {
		
		return parkingAreaService.selectParkingAreaDetail(parkingAreaVO);
	}
	
	@PostMapping(value = "parkingArea/checkParkingAreaStatement.do")
	public int checkParkingAreaStatement(@RequestBody ParkingAreaVO parkingAreaVO) throws Exception {
		parkingAreaVO = parkingAreaService.selectParkingAreaDetail(parkingAreaVO);
			
		int statement = parkingAreaVO.getAreaStatement();
		return statement;
	}
	
	@PostMapping(value = "parkingArea/updateParkingAreaStatement.do")
	public int updateParkingAreaStatement(@RequestBody ParkingAreaVO parkingAreaVO) throws Exception {
		
		return parkingAreaService.updateParkingAreaStatement(parkingAreaVO);
		
	}
}
