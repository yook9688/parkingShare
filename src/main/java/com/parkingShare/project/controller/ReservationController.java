package com.parkingShare.project.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;

import com.parkingShare.project.service.ReservationService;
import com.parkingShare.project.vo.ReservationVO;

@Controller
public class ReservationController {

	@Autowired
	ReservationService reservationService;
	
	@PostMapping(value = "reservattion/reservationList.do")
	public List<ReservationVO> selectReservationList(ReservationVO reservationVO) throws Exception {
		
		return reservationService.selectReservationList();
	}
	
	@PostMapping(value = "reservattion/reservationDetail.do")
	public ReservationVO selectReservationInfo(ReservationVO reservationVO) throws Exception {
		
		return reservationService.selectReservationDetail(reservationVO);
	}
}
