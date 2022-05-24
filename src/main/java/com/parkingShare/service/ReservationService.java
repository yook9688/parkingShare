package com.parkingShare.service;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.parkingShare.vo.ReservationVO;

@Mapper
public interface ReservationService {

	//���� ���
	List<ReservationVO> selectReservationList() throws Exception;
	
	//���� �󼼺���
	ReservationVO selectReservationDetail(ReservationVO reservationVO) throws Exception;
}

