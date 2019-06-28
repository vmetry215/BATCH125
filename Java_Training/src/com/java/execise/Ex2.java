package com.java.execise;

public class Ex2 {
	public static void main(String[] args) {
		String s = "am  in        chennai";
		int count = 0;
		for (int i = 0; i < s.length(); i++) {

			if (s.charAt(i) == ' ') {
				if (s.charAt(i - 1) == ' ') {
					continue;
				}
				count++;

			}
		}
		System.out.println(count + 1);

	}
}
