package com.java.exception;

public class StringIndexOutofBoundTest {
	public static void main(String[] args) {
		String s="hai";
		try{
		System.out.println(s.charAt(5));
		}catch(StringIndexOutOfBoundsException e){
			System.out.println("index value 0-2");
		}
		System.out.println("done");
	}
}
