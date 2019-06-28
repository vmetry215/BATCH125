package com.java.methods;

public class StaticTest {
	int a=10;
	static int b=30;
	static {
		System.out.println("static block");
	}
	public void display(){
		System.out.println(a);
		System.out.println(b);
		show();//can access static method from a static method
		System.out.println("Display method");
	}
	public static void show(){
		StaticTest obj=new StaticTest();
		System.out.println(obj.a);//cannot access non static variable from static method
		System.out.println(b);//can access static variable from static method
		System.out.println("static show method");
	}
	public static void main(String[] args) {
		System.out.println("main block");
		//display();//cannot access non static method from static method
		show();//can access static method from static method
	}
}
