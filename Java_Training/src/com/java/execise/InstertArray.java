package com.java.execise;


public interface InstertArray {
	public static void main(String[] args) {
		int[] a={10,20,30,40,50};
		
		int value = 25;
		int p = 3;
		
		for(int i=a.length-1;i>=0;i--){
			//System.out.println(a[i]);
			if(i>=3){
				a[i]=a[i-1];
			}
		}
		
		a[p-1]=value;
		
		for(int i=a.length-1;i>=0;i--){
			System.out.println(a[i]);
		}
		
	}
	

}
