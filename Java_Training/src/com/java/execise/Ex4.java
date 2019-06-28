package com.java.execise;

public class Ex4 {
	public static void main(String[] args) {
		String s1="abc";
		String s2="bcc";
		int count=0;
		if(s1.length()==s2.length()){
			System.out.println("String length is Equal");
			for(int i=0;i<s1.length();i++){
				for(int j=0;j<s2.length();j++){
					if(s1.charAt(i)==s2.charAt(j)){
					count++;
					
					}
				}
			}
			if(count==s1.length()){
				System.out.println("Both the Strings are equal");
			}
		}
	}
}
