package com.java.collection;

import java.util.Iterator;
import java.util.TreeSet;

public class TreeSetTest {
public static void main(String[] args) {
	TreeSet<Integer>ts=new TreeSet<Integer>();
	ts.add(10);
	ts.add(30);
	ts.add(15);
	ts.add(15);
	ts.add(20);
	ts.add(50);
	ts.add(25);
	//ts.add(null);
	Iterator<Integer>itr=ts.iterator();
	while (itr.hasNext()) {
		Integer i = (Integer) itr.next();
		System.out.println(i);
	}
}
}
