package com.parkingShare.project.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.parkingShare.project.dao.ReservationMapper;
import com.parkingShare.project.service.ReservationService;
import com.parkingShare.project.vo.ReservationVO;

@Service
public class ReservationServiceImpl implements ReservationService {
	
	@Autowired
	ReservationMapper reservationMapper;

	/**
	 * ���� ��� ��ȸ
	 * 
	 */
	@Override
	public List<ReservationVO> selectReservationList() throws Exception {
		return reservationMapper.selectReservationList();
	}

	/**
	 * ���� �� ��ȸ
	 * 
	 */
	@Override
	public ReservationVO selectReservationDetail(ReservationVO reservationVO) throws Exception {
		return reservationMapper.selectReservationDetail(reservationVO);
	}
	
	/**
	 * ���� ���
	 * 
	 */
	@Override
	public int insertReservation(ReservationVO reservationVO) throws Exception {
		return reservationMapper.insertReservation(reservationVO);
	}

	/**
	 * ���� ����
	 * 
	 */
	@Override
	public int deleteReservation(ReservationVO reservationVO) throws Exception {
		return reservationMapper.deleteReservation(reservationVO);
	}
	
	

	
}
