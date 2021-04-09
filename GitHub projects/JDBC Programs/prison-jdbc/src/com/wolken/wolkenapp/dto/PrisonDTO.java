package com.wolken.wolkenapp.dto;

public class PrisonDTO {

	private int prisonId;
	private String prisonName;
	private int noOfInmates;
	private String prisonArea;
	private String prisonState;

	public PrisonDTO() {
		// TODO Auto-generated constructor stub
	}

	public int getPrisonId() {
		return prisonId;
	}

	public void setPrisonId(int prisonId) {
		this.prisonId = prisonId;
	}

	public String getPrisonName() {
		return prisonName;
	}

	public void setPrisonName(String prisonName) {
		this.prisonName = prisonName;
	}

	public int getNoOfInmates() {
		return noOfInmates;
	}

	public void setNoOfInmates(int noOfInmates) {
		this.noOfInmates = noOfInmates;
	}

	public String getPrisonArea() {
		return prisonArea;
	}

	public void setPrisonArea(String prisonArea) {
		this.prisonArea = prisonArea;
	}

	public String getPrisonState() {
		return prisonState;
	}

	public void setPrisonState(String prisonState) {
		this.prisonState = prisonState;
	}

}
