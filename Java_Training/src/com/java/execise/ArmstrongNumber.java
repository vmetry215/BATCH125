package com.java.execise;

public class ArmstrongNumber {
	public static void main(String[] args) {
		int n=153,b=0;
		int temp=n;
		while(n>0){
			int a=n%10;
			b=b+(a*a*a);
			n=n/10;
			//System.out.println(b);
		}
		if(b==temp){
			System.out.println("Armstrong Number");
		}else{
			System.out.println("Not an Armstrong Number");
		}
		
	}
}
