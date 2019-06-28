package com.java.methods;

public class MethodWithoutParameter {
	public void display() {
		System.out.println("hai");
	}
	public int add(){
		int a=10;
		int b=20;
		int c=a+b;
		return c;
		
	}
	public static void main(String[] args) {
		MethodWithoutParameter obj=new MethodWithoutParameter();
		obj.display();
		int k =obj.add();
		System.out.println(k);
		System.out.println(obj.add());
		
	}
}
