package com.java.execise;

public class Ex1 {
	public static void main(String[] args) {
		String s="goodmorning";
		int n=4;
		int temp=n;
		for(int i=0;i<=(s.length()-temp);i++){
			System.out.println(s.substring(i, n));
			n++;
		}
	}
}
