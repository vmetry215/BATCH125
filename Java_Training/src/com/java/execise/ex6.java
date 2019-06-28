package com.java.execise;

public class ex6 {
	public static void main(String[] args) {
		int i = 51234;
		int a=0, b=0;
		for (int j = 0; j <= i; j++) {
			b = i % 10;
			//System.out.print(b);
			a =(a*10)+b;
			float temp = (i / 10);
			i=(int)temp;
			//i=(int)Math.floor(temp);
			
		}
		if(i==1){
			a=(a*10)+i;
		}
		System.out.println(a);
		//System.out.println(i);
	}
	
}
