package com.java.string;

public class StringBufferTest {
	public static void main(String[] args) {
		String s=new String("Hello");
		//System.out.println(s);
		StringBuffer sb=new StringBuffer("hello");
		System.out.println(sb);
		sb.append(" Java");
		System.out.println(sb);
		sb.insert(1, "Hai");
		System.out.println(sb);
		sb.delete(1, 4);
		System.out.println(sb);
		sb.replace(5, 10, "JAVA");
		System.out.println(sb);
		sb.reverse();
		System.out.println(sb);
	}
}
