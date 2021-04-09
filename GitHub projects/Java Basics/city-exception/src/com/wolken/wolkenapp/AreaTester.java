package com.wolken.wolkenapp;

import java.util.Scanner;

public class AreaTester {
	public static void main(String[] args) {
		Area area = new Area();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the area size");
		double size = sc.nextDouble();

		try {
			area.isCity(size);
		} catch (AreaException e) {
			// TODO Auto-generated catch block
			// e.printStackTrace();
			System.out.println(e.getMessage());
		}
	}

}
