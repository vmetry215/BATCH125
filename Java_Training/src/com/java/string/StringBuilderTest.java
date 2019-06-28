package com.java.string;

public class StringBuilderTest {
	public static void main(String[] args) {
		StringBuilder s=new StringBuilder("Hello");
		System.out.println(s);
		s.append(" java");
		System.out.println(s);
		s.insert(5, " hai");
		System.out.println(s);
		s.delete(5, 9);
		System.out.println(s);
		s.replace(5, 10, " JAVA");
		System.out.println(s);
		s.reverse();
		System.out.println(s);
	}
}
