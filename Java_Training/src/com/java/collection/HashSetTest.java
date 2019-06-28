package com.java.collection;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetTest {
public static void main(String[] args) {
	HashSet<Integer> hs=new HashSet<Integer>();
	hs.add(10);
	hs.add(20);
	hs.add(20);
	hs.add(40);
	hs.add(50);
	hs.add(30);
	hs.add(25);
	hs.add(null);
	Iterator<Integer> itr=hs.iterator();
	while (itr.hasNext()) {
		Integer i = (Integer) itr.next();
		System.out.println(i);
	}
}
}
