package com.java.collection;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayList1Test {
	public static void main(String[] args) {
		ArrayList<Object> al=new ArrayList<Object>();
		al.add("chennai");
		al.add(20);
		al.add(1.25);
		al.add('z');
		Iterator<Object> itr=al.iterator();
		while (itr.hasNext()) {
			Object obj = (Object) itr.next();
			System.out.println(obj);
			
		}
	}
}
