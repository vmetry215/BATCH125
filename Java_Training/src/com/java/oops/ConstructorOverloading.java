package com.java.oops;

public class ConstructorOverloading {
	public ConstructorOverloading() {
		System.out.println("no parameter");
	}
	public ConstructorOverloading(int a){
		System.out.println("with parameter");
	}
	public static void main(String[] args) {
		ConstructorOverloading obj1=new ConstructorOverloading();
		ConstructorOverloading obj2=new ConstructorOverloading(10);
		int a=10;
		System.out.println(a);
	}
}
