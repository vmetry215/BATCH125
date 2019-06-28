package com.java.exception;

public class ThrowTest {
	public static void main(String[] args) {
		int n=10;
		if(n>=18){
			System.out.println("Can vote");
		}else{
			throw new ArithmeticException("Cannot vote");
		}
	}
}
