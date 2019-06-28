package com.java.oops;

class A{
	public void display(){
		System.out.println("Display method from class A");
	}
	
}
class B extends A{
	public void show(){
		System.out.println("Show method from class B");
	}
}
public class SingleInhertitance {
	public static void main(String[] args) {
		//A obj1=new A();
		B obj2=new B();
		obj2.display();
		obj2.show();
		
	}
}
