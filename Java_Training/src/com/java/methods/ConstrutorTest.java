package com.java.methods;

public class ConstrutorTest {
	public ConstrutorTest() {
		System.out.println("Am in construtor");
	}
	public ConstrutorTest(int a){
		System.out.println("a="+a);
	}
	public static void main(String[] args) {
		ConstrutorTest obj=new ConstrutorTest(10);
		ConstrutorTest obj1=new ConstrutorTest();
		System.out.println("Done");
	}
	
}
