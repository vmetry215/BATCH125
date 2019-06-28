package com.java.array;

import java.util.Scanner;

public class MultiDimenstion {
	public static void main(String[] args) {
		int a[][]=new int[3][3];
		Scanner scan=new Scanner(System.in);
		for(int i=0;i<3;i++){
			for(int j=0;j<3;j++){
				//System.out.println("("+i+","+j+")");
				System.out.println("Enter the value for A array: ");
				a[i][j]= scan.nextInt();
			}
		}
		for(int i=0;i<3;i++){
			for(int j=0;j<3;j++){
				System.out.print(a[i][j]+" ");
			}
			System.out.println();
		}
		int b[][]=new int[3][3];
		//Scanner scan=new Scanner(System.in);
		for(int i=0;i<3;i++){
			for(int j=0;j<3;j++){
				//System.out.println("("+i+","+j+")");
				
				System.out.println("Enter the value for B array: ");
				b[i][j]= scan.nextInt();
			}
		}
		for(int i=0;i<3;i++){
			for(int j=0;j<3;j++){
				System.out.print(b[i][j]+" ");
			}
			System.out.println();
		}
		int c[][]=new int[3][3];
		for(int i=0;i<3;i++){
			for(int j=0;j<3;j++){
				c[i][j]=a[i][j]+b[i][j];
				
			}
			
		}
		System.out.println("Addtion of matrix A and B :");
		for(int i=0;i<3;i++){
			for(int j=0;j<3;j++){
				
				System.out.print(c[i][j]+" ");
			}
			System.out.println();
		}
	}
}
