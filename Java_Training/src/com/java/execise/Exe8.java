package com.java.execise;

public class Exe8 {
	public static void main(String[] args) {
		int b=100,c=0;
		for(int i=1;i<=b;i++){
			c=c+i;
			int temp=c;
			c=i;
			i=temp;
			System.out.print(c+"+");
			
		}
		
		
	}
}
