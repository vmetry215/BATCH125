package com.java.oops;
class RBI{
	public void display(){
		System.out.println("Display method from RBI");
	}
}
class SBI extends RBI{
	public void show(){
		System.out.println("show method from SBI");
	}
}
class HDFC extends SBI{
	public void print(){
		System.out.println("Print method from HDFC");
	}
}
public class Multilevel {
	public static void main(String[] args) {
		HDFC obj=new HDFC();
		obj.display();
		obj.show();
		obj.print();
	}
}
