package com.wolken.wolkenapp;

public class Area {
	public void isCity(double sizeInSquareKms) throws AreaException {
		if(sizeInSquareKms> 10000.0)
			System.out.println("The area can be classified as a city");
		else
			throw new AreaException();
	}
}
