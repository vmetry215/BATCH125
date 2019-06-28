package com.java.execise;

import java.util.Scanner;

public class FindNumber {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("enter search value:");
		int n=scan.nextInt();
		boolean found=false;
		int count=0;
		int a[]={10,20,30,40,40};
		for(int i=0;i<a.length;i++){
			//System.out.println(a[i]);
			if(a[i]==n){
				found=true;
				count++;
			}
		}
		if(count>0){
			System.out.println("present:"+count);
		}else{
			System.out.println("not present");
		}
		
	
	}
}
