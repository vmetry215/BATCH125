package com.java.oops;

public class TypeCasting {
	public static void main(String[] args) throws InterruptedException {
		//int to long
		int n=10;
		long n1=n;//int to long
		int n2=(int)n1;//long to int
		
		String s="10";
		int i=Integer.parseInt(s);
		System.out.println(i+Integer.parseInt(s));
		
		s=String.valueOf(i);
		char c='1';
		int k=c;
		System.out.println(k);
		
		char j='1';
		int b=Character.getNumericValue(j);
		System.out.println(b);
		
		Thread.sleep(10000);
		System.out.println("hai");
	}
}
