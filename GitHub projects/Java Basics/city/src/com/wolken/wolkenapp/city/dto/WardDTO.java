package com.wolken.wolkenapp.city.dto;

public class WardDTO {

	private int wardNo;
	private String wardName;
	private String corporator;
	private double areaInSquareKms;

	public WardDTO() {
		System.out.println(this.getClass().getSimpleName() + " object created");
	}

	public int getWardNo() {
		return wardNo;
	}

	public String getWardName() {
		return wardName;

	}

	public String getCorporator() {
		return corporator;
	}

	public double getAreaInSquareKms() {
		return areaInSquareKms;
	}

	public void setWardNo(int wardNo) {
		this.wardNo = wardNo;
	}

	public void setWardName(String wardName) {
		this.wardName = wardName;

	}

	public void setCorporator(String corporator) {
		this.corporator = corporator;
	}

	public void setAreaInSquareKms(double areaInSquareKms) {
		this.areaInSquareKms = areaInSquareKms;
	}
}
