package com.wolken.wolkenapp.dto;

public class WardDTO {

	private int wardNo;
	private String wardName;
	private String corporator;
	private double areaInSquareKms;

	public WardDTO(int wardDTO,String wardName,String corporator, double areaInSquareKms) {
		System.out.println(this.getClass().getSimpleName() + " object created");
		this.wardNo=wardDTO;
		this.wardName=wardName;
		this.corporator=corporator;
		this.areaInSquareKms=areaInSquareKms;
		
		System.out.println();
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
	
	@Override
	public String toString() {
		return wardNo+" "+wardName + " " + corporator +" "+ areaInSquareKms;
	}
}
