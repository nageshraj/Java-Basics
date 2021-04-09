package com.wolken.wolkenapp.dto;

public class MobileDTO {

	private int mobileId;
	private String mobileName;
	private String mobileBrand;
	private int mobileRam;
	private int mobileNoOfCamera;

	public MobileDTO() {
	}

	public int getMobileId() {
		return mobileId;
	}

	public void setMobileId(int mobileId) {
		this.mobileId = mobileId;
	}

	public String getMobileName() {
		return mobileName;
	}

	public void setMobileName(String mobileName) {
		this.mobileName = mobileName;
	}

	public String getMobileBrand() {
		return mobileBrand;
	}

	public void setMobileBrand(String mobileBrand) {
		this.mobileBrand = mobileBrand;
	}

	public int getMobileRam() {
		return mobileRam;
	}

	public void setMobileRam(int mobileRam) {
		this.mobileRam = mobileRam;
	}

	public int getMobileNoOfCamera() {
		return mobileNoOfCamera;
	}

	public void setMobileNoOfCamera(int mobileNoOfCamera) {
		this.mobileNoOfCamera = mobileNoOfCamera;
	}

}
