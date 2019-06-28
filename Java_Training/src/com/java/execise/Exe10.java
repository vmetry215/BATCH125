package com.java.execise;

public class Exe10 {
	public static void main(String[] args) {
		int a = 10;
		int b = 99;

		for (int i = a; i <= b; i++) {
			int t = i;
			int count = 0;
			// System.out.println("hai");
			for (int j = 1; j <= t; j++) {
				if ((t % j) == 0) {
					count++;
				}
			}
			if (count == 2) {
				System.out.println(t);
			}

		}
	}
}
