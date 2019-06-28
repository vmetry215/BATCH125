package com.java.oops;

public class EnclapsulationTest2 {
	public static void main(String[] args) {
		EnclapsulationTest1 obj=new EnclapsulationTest1();
		System.out.println(obj.getUniv());
		System.out.println(obj.getTotal_student());
		obj.tot_staff=2000;
		obj.setTotal_student(8000);
		System.out.println(obj.getTotal_student());
	}
}
