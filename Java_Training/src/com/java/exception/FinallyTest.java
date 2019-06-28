package com.java.exception;

import java.util.Scanner;

public class FinallyTest {
	public static void main(String[] args) {
		Scanner s= new Scanner(System.in);
		try{
			System.out.println("Enter the value");
			int i=s.nextInt();
			System.out.println(i/0);
			
		}catch(Exception e){
			System.out.println("Catch block");
		}finally{
			s.close();
			System.out.println("Finally block");
		}
	}
}
