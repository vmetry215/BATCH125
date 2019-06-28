package com.java.execise;

import java.util.Scanner;

public class Exe5 {
	public static void main(String[] args) {
		Scanner v=new Scanner(System.in);
		System.out.println("Enter the string value");
		String s =v.nextLine() ;
		int n = 0;
		// int value = 0;
		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) == '(') {
				n = i - 1;
				//System.out.println(n);
				int value = Character.getNumericValue(s.charAt(n));
				//System.out.println(value);
				//System.out.println(i);
				System.out.print(s.substring(0, n));
				for (int j = i + 1; j < s.length()-1; j++) {
					for (int k = 1; k <=value; k++) {
						System.out.print(s.charAt(j));
					}
				}
			}

		}

	}
}
