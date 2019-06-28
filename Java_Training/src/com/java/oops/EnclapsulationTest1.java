package com.java.oops;

public class EnclapsulationTest1 {
	private String univ = "Anna Univeristy";
	private int total_student=7500;
	public int tot_staff=1000;
	public String getUniv(){
		return this.univ;
	}
	public int getTotal_student(){
		return this.total_student;
	}
	public void setTotal_student(int total_student){
		this.total_student=total_student;
		
	}
}
