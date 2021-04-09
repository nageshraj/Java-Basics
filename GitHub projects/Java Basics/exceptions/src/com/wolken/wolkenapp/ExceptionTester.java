package com.wolken.wolkenapp;

public class ExceptionTester {
	public static void main(String[] args) {
		// exception is an event that gets triggered in JVM because of abnormal
		// condition

		// catch is known as handler

		System.out.println("Main started");
		int a = 12;
		int b = 0;
		try {
			System.out.println(a / b);// arithmetic exception

		} catch (Exception e) {
			System.out.println("Caught array: \n");
			// e.printStackTrace();

		}

		int arr[] = { 1, 2, 3, 4, 5 };
		try {
			System.out.println(arr[6]); // ArrayIndexOutofBounds
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Array: " + e);
		}

		String mama = null;

		try {
			System.out.println(mama.charAt(0)); // null pointer exception
		} catch (NullPointerException n) {
			System.out.println("Null: " + n);
		}

		System.out.println("Main ended");

	}

}
