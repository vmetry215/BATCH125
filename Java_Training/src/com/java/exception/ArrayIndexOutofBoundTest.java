package com.java.exception;

public class ArrayIndexOutofBoundTest {
	public static void main(String[] args) {
		int a[]={10,20,30,40};
		try{
		System.out.println(a[20]);
		}catch(ArrayIndexOutOfBoundsException e){
			System.out.println("Array index 0-3");
		}
		System.out.println("done");
	}
}
