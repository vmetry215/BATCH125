package com.java.execise;

public class Vowels {
	public static void main(String[] args) {
		String s = "aravindh";
		String v = "aeiou";
		int vow = 0;
		int con = 0;
		for (int i = 0; i < s.length(); i++) {
			for (int j = 0; j < v.length(); j++) {
				// System.out.println(s.charAt(i)+"=="+v.charAt(j));
				if (s.charAt(i) == v.charAt(j)) {
					vow++;
					//continue;
				}
			}
			con=s.length()-vow;
		}
		
		System.out.println("vow==" + vow + "  " + "con==" + con);
	}
}
