package com.java.methods;

public class MethodWithParameter {
	public void display(String name) {
		System.out.println(name);
		
	}
	public char add(String s1, String s2){
		return ("india".charAt(0));
		
	}
	public static void main(String[] args) {
		MethodWithParameter obj=new MethodWithParameter();
		obj.display("aravindh");
		String a="chennai";
		String b="adyar";
		char c=obj.add(a, b);
		System.out.println(c);
		//MethodWithoutParameter obj1=new MethodWithoutParameter();
		
	}
	
}
