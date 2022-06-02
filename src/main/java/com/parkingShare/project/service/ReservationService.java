package com.parkingShare.project.service;

import java.util.List;

import com.parkingShare.project.vo.ReservationVO;

public interface ReservationService {

	//���� ���
	List<ReservationVO> selectReservationList() throws Exception;
	
	//���� �󼼺���
	ReservationVO selectReservationDetail(ReservationVO reservationVO) throws Exception;
	
	//���� ���
	int insertReservation(ReservationVO reservationVO) throws Exception;
	
	//���� ����
	int deleteReservation(ReservationVO reservationVO) throws Exception;
}

