package com.parkingShare.project.vo;

import org.apache.ibatis.type.Alias;

@Alias("ReservationVO")
public class ReservationVO {

	private int reservationIdx;
	private int userIdx;
	private int hostidx;
	private int areaIdx;
	private String reservationStartTime;
	private String reservationEndTime;
	private String createdDate;
	private String updatedDate;
	
	public int getReservationIdx() {
		return reservationIdx;
	}
	public void setReservationIdx(int reservationIdx) {
		this.reservationIdx = reservationIdx;
	}
	public int getUserIdx() {
		return userIdx;
	}
	public void setUserIdx(int userIdx) {
		this.userIdx = userIdx;
	}
	public int getHostidx() {
		return hostidx;
	}
	public void setHostidx(int hostidx) {
		this.hostidx = hostidx;
	}
	public int getAreaIdx() {
		return areaIdx;
	}
	public void setAreaIdx(int areaIdx) {
		this.areaIdx = areaIdx;
	}
	public String getReservationStartTime() {
		return reservationStartTime;
	}
	public void setReservationStartTime(String reservationStartTime) {
		this.reservationStartTime = reservationStartTime;
	}
	public String getReservationEndTime() {
		return reservationEndTime;
	}
	public void setReservationEndTime(String reservationEndTime) {
		this.reservationEndTime = reservationEndTime;
	}
	public String getCreatedDate() {
		return createdDate;
	}
	public void setCreatedDate(String createdDate) {
		this.createdDate = createdDate;
	}
	public String getUpdatedDate() {
		return updatedDate;
	}
	public void setUpdatedDate(String updatedDate) {
		this.updatedDate = updatedDate;
	}
}
