package com.java.oops;

public class MethodOverloading {
	public void add(){
		System.out.println("ADD method");
	}
	public void add(int a,int b){
		System.out.println(a+b);
	}
	public void add(int a,int b,int c){
		System.out.println(a+b+c);
	}
	public static void main(String[] args) {
		MethodOverloading obj=new MethodOverloading();
		obj.add();
		obj.add(10, 20);
		obj.add(10, 20, 30);
		
	}
}
