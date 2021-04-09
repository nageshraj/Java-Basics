package com.wolken.wolkenapp;

public class SingleTryMultipleCatch {
	public static void main(String[] args) {

		int a[] = { 1, 2, 3 };
		try {
			System.out.println(a[1] / 0);
		} catch (ArithmeticException | ArrayIndexOutOfBoundsException arr) {
			System.out.println("Exception : " + arr);
		}

		finally {
			System.out.println("Finally is executed");
		}
	}
}
