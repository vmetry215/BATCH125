package com.java.oops;
class CARS{
	public void display(){
		System.out.println("Display method from CARS");
	}
}
class Audi extends CARS{
	public void show(){
		System.out.println("show method from AUDI");
	}
}
class BMW extends CARS{
	public void print(){
		System.out.println("Print method from BMW");
	}
}
public class Hierarchial {
	public static void main(String[] args) {
		Audi obj1=new Audi();
		BMW obj2=new BMW();
		obj1.display();
		obj1.show();
		obj2.display();
		obj2.print();
	}
}
