package com.parkingShare.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.parkingShare.dao.ReservationMapper;
import com.parkingShare.service.ReservationService;
import com.parkingShare.vo.ReservationVO;

@Service
public class ReservationServiceImpl implements ReservationService {
	
	@Autowired
	ReservationMapper reservationMapper;

	/**
	 * 예약 목록 조회
	 * 
	 */
	@Override
	public List<ReservationVO> selectReservationList() throws Exception {
		return reservationMapper.selectReservationList();
	}

	/**
	 * 예약 상세 조회
	 * 
	 */
	@Override
	public ReservationVO selectReservationDetail(ReservationVO reservationVO) throws Exception {
		return reservationMapper.selectReservationDetail(reservationVO);
	}

	
}
