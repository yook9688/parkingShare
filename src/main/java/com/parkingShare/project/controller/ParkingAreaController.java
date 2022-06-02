package com.parkingShare.project.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.parkingShare.project.service.ParkingAreaService;
import com.parkingShare.project.vo.ParkingAreaVO;

@RestController
public class ParkingAreaController {

	@Autowired
	ParkingAreaService parkingAreaService;
	
	@RequestMapping(value = "/parkingArea/list.do")
	public List<ParkingAreaVO> selectParkingAreaList() throws Exception {
		
		return parkingAreaService.selectParkingAreaList();
	}
	
	@PostMapping(value = "/parkingArea/parkingAreaDetail.do")
	public ParkingAreaVO selectParkingAreaInfo(ParkingAreaVO parkingAreaVO) throws Exception {
		
		return parkingAreaService.selectParkingAreaDetail(parkingAreaVO);
	}
	
	@PostMapping(value = "/parkingArea/checkParkingAreaStatement.do")
	public int checkParkingAreaStatement(@RequestBody ParkingAreaVO parkingAreaVO) throws Exception {
		parkingAreaVO = parkingAreaService.selectParkingAreaDetail(parkingAreaVO);
			
		int statement = parkingAreaVO.getAreaStatement();
		return statement;
	}
	
	@PostMapping(value = "/parkingArea/updateParkingAreaStatement.do")
	public int updateParkingAreaStatement(@RequestBody ParkingAreaVO parkingAreaVO) throws Exception {
		
		return parkingAreaService.updateParkingAreaStatement(parkingAreaVO);
		
	}
	
	@PostMapping(value = "/parkingArea/updateParkingArea.do")
	public int updateParkingArea(@RequestBody ParkingAreaVO parkingAreaVO) throws Exception {
		
		return parkingAreaService.updateParkingArea(parkingAreaVO);
		
	}
	
	@PostMapping(value = "/parkingArea/insertParkingArea.do")
	public int insertParkingArea(@RequestBody ParkingAreaVO parkingAreaVO) throws Exception {
		
		return parkingAreaService.insertParkingArea(parkingAreaVO);
		
	}
}
