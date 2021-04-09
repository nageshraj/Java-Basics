package com.wolken.wolkenapp;

public class EqualsDemo {
	public static void main(String[] args) {
		String name1 = "banglore"; // literal way of creating strings
		String name2 = "banglore";

		// strings are created in string constant pool in heap

		String name3 = new String("mangalore"); // using new to creating strings
		String name4 = new String("mangalore");

		String name5 = new String("banglore");

		if (name1.equals(name2))
			System.out.println("Names are equal");
		else
			System.out.println("Names are not equal");

		if (name1 == name2)
			System.out.println("Names are equal");
		else
			System.out.println("Names are not equal");

		if (name3.equals(name4))
			System.out.println("Names are equal");
		else
			System.out.println("Names are not equal");

		if (name3 == name4)
			System.out.println("Names are equal");
		else
			System.out.println("Names are not equal");

		if (name1 == name5)
			System.out.println("Names are equal");
		else
			System.out.println("Names are not equal");

		if (name1.equals(name5))
			System.out.println("Names are equal");
		else
			System.out.println("Names are not equal");

	}

}
