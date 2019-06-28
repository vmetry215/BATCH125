package com.java.exception;

public class NullPointerExceptionTest {
	public static void main(String[] args) {
		String s=null;
		try{
		System.out.println(s.length());
		}catch(NullPointerException e){
			System.out.println("S value is null");
		}
		System.out.println("done");
	}
}
