package com.java.execise;

public class FindingSmallest {
	public static void main(String[] args) {
		int a[]={10,12,15,8,4,20};
		//System.out.println(a.length);
		int small=a[0];
		for(int i=0;i<a.length;i++){
			if(small>a[i]){
				small=a[i];
			}
		}
		System.out.println(small);
	}
}
