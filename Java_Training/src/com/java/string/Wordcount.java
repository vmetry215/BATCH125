package com.java.string;

public class Wordcount {
	public static void main(String[] args) {
		String s ="chennai     adyar";
		int count=0;
		for(int n=0;n<s.length();n++){
			System.out.print(s.charAt(n));
			if(s.charAt(n)==' '){
			//	System.out.println("=");
				if(s.charAt(n-1)!=' '){
					count++;
				}
			
			}
		}
		System.out.println("count="+(count+1));
	}
}

