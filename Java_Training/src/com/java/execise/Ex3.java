package com.java.execise;

import java.util.Scanner;

public class Ex3 {
	public static void main(String[] args) {
		int a[]=new int[5];
		int count=0;
		System.out.println(a.length);
		Scanner scan=new Scanner(System.in);
		for(int i=0;i<a.length;i++){
			System.out.println("Enter a["+i+"] :");
			a[i]=scan.nextInt();
			
		}
		for(int j=0;j<a.length;j++){
			System.out.print(a[j]+" ");
		}
		System.out.println("=========================================");
		for(int k=0;k<a.length;k++){
			count=0;
			for(int l=0;l<a.length;l++){
				//System.out.println(a[k]+"=="+a[l]);
				if(a[k]==a[l]){
					count++;
				}
				
			}
			System.out.println(a[k]+"==>"+count);
			if(count==1){
				System.out.println("Unique number:"+a[k]);
			}
		}
	}
}
