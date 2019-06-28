package com.java.array;

public class SingleDimentionalArray {
	public static void main(String[] args) {
		int a[]=new int[5];
		a[0]=10;
		a[1]=20;
		a[2]=30;
		a[3]=40;
		a[4]=50;
		//a[5]=60;
		System.out.println(a[0]);
		System.out.println(a.length);
		for(int n=0;n<a.length;n++){
			System.out.println(a[n]);
		}
		int b[]={10,20,30,40};
		System.out.println(b[2]);
	}
}
