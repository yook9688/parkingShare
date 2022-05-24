package com.parkingShare.project.vo;

import org.apache.ibatis.type.Alias;

@Alias("ParkingAreaVO")
public class ParkingAreaVO {

	private int areaIdx;
	private double latitude;
	private double lognitude;
	private String parkingStartTime;
	private String parkingEndTime;
	private String parkingStartDate;
	private String parkingEndDate;
	private int areaStatement;
	private String useYn;
	
	public int getAreaIdx() {
		return areaIdx;
	}
	public void setAreaIdx(int areaIdx) {
		this.areaIdx = areaIdx;
	}
	public double getLatitude() {
		return latitude;
	}
	public void setLatitude(double latitude) {
		this.latitude = latitude;
	}
	public double getLognitude() {
		return lognitude;
	}
	public void setLognitude(double lognitude) {
		this.lognitude = lognitude;
	}
	public String getParkingStartTime() {
		return parkingStartTime;
	}
	public void setParkingStartTime(String parkingStartTime) {
		this.parkingStartTime = parkingStartTime;
	}
	public String getParkingEndTime() {
		return parkingEndTime;
	}
	public void setParkingEndTime(String parkingEndTime) {
		this.parkingEndTime = parkingEndTime;
	}
	public String getParkingStartDate() {
		return parkingStartDate;
	}
	public void setParkingStartDate(String parkingStartDate) {
		this.parkingStartDate = parkingStartDate;
	}
	public String getParkingEndDate() {
		return parkingEndDate;
	}
	public void setParkingEndDate(String parkingEndDate) {
		this.parkingEndDate = parkingEndDate;
	}
	public int getAreaStatement() {
		return areaStatement;
	}
	public void setAreaStatement(int areaStatement) {
		this.areaStatement = areaStatement;
	}
	public String getUseYn() {
		return useYn;
	}
	public void setUseYn(String useYn) {
		this.useYn = useYn;
	}

}
