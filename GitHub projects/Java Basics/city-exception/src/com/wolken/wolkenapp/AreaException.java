package com.wolken.wolkenapp;

public class AreaException extends Exception {

	@Override
	public String toString() {
		return "Area is wrongly classified as a city";
	}

	@Override
	public String getMessage() {
		return "Area is wrongly classified as a city";
	}
}
