package com.java.oops;

public class AccessModifier {
	private void display1(){
		System.out.println("Private Method");
		
	}
	protected void display2(){
		System.out.println("Protected Method");
	}
	public void display3(){
		System.out.println("Public Method");
	}
	public static void main(String[] args) {
		AccessModifier obj=new AccessModifier();
		obj.display1();
		obj.display2();
		obj.display3();
	}
}
