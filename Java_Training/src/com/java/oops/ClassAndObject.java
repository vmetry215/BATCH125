package com.java.oops;

public class ClassAndObject {
	int a=10;
	int b=20;
	static int c=50;
	public static void main(String[] args) {
		ClassAndObject obj1= new ClassAndObject();
		ClassAndObject obj2= new ClassAndObject();
		obj1.a=30;
		System.out.println(obj2.a);
		System.out.println(obj1.a);
		obj2.b=obj1.a;
		System.out.println(obj2.a);
		System.out.println(obj2.b);
		obj1.c=100;
		System.out.println(obj2.c);
	}
}
