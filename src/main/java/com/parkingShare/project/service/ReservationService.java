package com.parkingShare.project.service;

import java.util.List;

import com.parkingShare.project.vo.ReservationVO;

public interface ReservationService {

	//예약 목록
	List<ReservationVO> selectReservationList() throws Exception;
	
	//예약 상세보기
	ReservationVO selectReservationDetail(ReservationVO reservationVO) throws Exception;
	
	//예약 등록
	int insertReservation(ReservationVO reservationVO) throws Exception;
	
	//예약 삭제
	int deleteReservation(ReservationVO reservationVO) throws Exception;
}

