package com.java.oops;
class A1{
	public void add(int a,int b){
		System.out.println("class A1 ="+(a+b));
	}
}
class B1 extends A1{
	public void add(int a,int b){
		super.add(30, 40);
		System.out.println("class B1 ="+(a+b));
	}
}
public class MethodOverload {
	public static void main(String[] args) {
		B1 obj=new B1();
		obj.add(10, 20);
		
	}
}
