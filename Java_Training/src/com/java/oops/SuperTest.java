package com.java.oops;
class Univ{
	public Univ(){
		System.out.println("Univ Constructor");
	}
	public void show(){
		System.out.println("Show method");
	}
}
class Dept extends Univ{
	public Dept(){
		super();
		super.show();
		System.out.println("Dept Constructor");
	}
	public void display(){
		System.out.println("Display method");
	}
}
public class SuperTest {
	public static void main(String[] args) {
		Dept obj1=new Dept();
		obj1.display();
	}
}
