package com.java.oops;

import java.util.Scanner;

class MarkSheet{
	int english=0;
	int tamil=0;
	int maths=0;
	public void getTotal(int english,int tamil,int maths){
		this.english=english;
		this.tamil=tamil;
		this.maths=maths;
		System.out.println(english+tamil+maths);
	}
	public void total(){
		System.out.println(english);
		System.out.println(tamil);
		System.out.println(maths);
		
	}
}
public class ThisTest {
	public static void main(String[] args) {
		Scanner s= new Scanner(System.in);
		System.out.println("enter english mark");
		int eng=s.nextInt();
		System.out.println("enter tamil mark");
		int tam=s.nextInt();
		System.out.println("enter maths mark");
		int mat=s.nextInt();
		MarkSheet obj=new MarkSheet();
		obj.getTotal(eng,tam,mat);
		obj.total();
	}
}
