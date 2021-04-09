package com.wolken.wolkenapp;

public class ThrowingExceptions {
	public static void main(String[] args) throws ClassNotFoundException {
		System.out.println("Main started");
		loadException();
		try {
			loadException();
		} catch (ClassNotFoundException c) {
			System.out.println("catching exception: " + c);
		}

	}

	public static void loadException() throws ClassNotFoundException {

		Class.forName("com.wolken.wolkenapp.ThrowingException");
		System.out.println("Main ended");
	}

}
