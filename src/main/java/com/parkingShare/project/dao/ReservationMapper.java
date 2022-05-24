package com.parkingShare.project.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.parkingShare.project.vo.ReservationVO;

@Mapper
public interface ReservationMapper {

	//예약 목록
	List<ReservationVO> selectReservationList() throws Exception;
	
	//예약 상세보기
	ReservationVO selectReservationDetail(ReservationVO reservationVO) throws Exception;
}

