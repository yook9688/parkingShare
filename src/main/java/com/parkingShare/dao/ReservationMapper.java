package com.parkingShare.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.parkingShare.vo.ReservationVO;

@Mapper
public interface ReservationMapper {

	//���� ���
	List<ReservationVO> selectReservationList() throws Exception;
	
	//���� �󼼺���
	ReservationVO selectReservationDetail(ReservationVO reservationVO) throws Exception;
}

