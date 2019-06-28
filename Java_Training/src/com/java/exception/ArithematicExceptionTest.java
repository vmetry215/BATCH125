package com.java.exception;

public class ArithematicExceptionTest {
	public static void main(String[] args) {
		int i=10;
		try{
		System.out.println(i/0);
		}catch(ArithmeticException e){
			System.out.println("Divided by 0");
			e.printStackTrace();
		}
		System.out.println("done");
	}
}
