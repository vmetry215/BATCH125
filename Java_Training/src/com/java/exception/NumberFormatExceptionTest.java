package com.java.exception;

public class NumberFormatExceptionTest {
	public static void main(String[] args) {
		String s = "a1";
		try {
			System.out.println(Integer.parseInt(s));
		} catch (NumberFormatException e) {
			System.out.println("s value is alphanumberic");
		}
		System.out.println("done");
	}
}
