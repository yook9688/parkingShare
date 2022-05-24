package com.parkingShare.project.service;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.parkingShare.project.vo.ReservationVO;

@Mapper
public interface ReservationService {

	//���� ���
	List<ReservationVO> selectReservationList() throws Exception;
	
	//���� �󼼺���
	ReservationVO selectReservationDetail(ReservationVO reservationVO) throws Exception;
}

