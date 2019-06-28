package com.java.execise;

public class StringCompare {
	public static void main(String[] args) {
		String s1 = "abc";
		String s2 = "abc";
		int count =0;
		if(s1.length() == s2.length()){
			for(int i=0;i<s1.length();i++){
				for(int j=0;j<s2.length();j++){
					System.out.println(s1.charAt(i)+"=="+s2.charAt(j));
					if(s1.charAt(i)==s2.charAt(j)){
						System.out.println("====");
						count++;
					}
				}
			}
			
			System.out.println("Count = " + count);
			
			if(s1.length() == count ){
				System.out.println("Equal");
			}else{
				System.out.println("Not equal");
			}
		}else{ 
			System.out.println("Not Equal");
		}

	}

}
