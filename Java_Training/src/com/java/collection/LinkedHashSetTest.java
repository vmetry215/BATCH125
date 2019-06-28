package com.java.collection;

import java.util.Iterator;
import java.util.LinkedHashSet;

public class LinkedHashSetTest {
public static void main(String[] args) {
	LinkedHashSet<Integer> lhashset=new LinkedHashSet<Integer>();
	lhashset.add(10);
	lhashset.add(30);
	lhashset.add(20);
	lhashset.add(20);
	lhashset.add(15);
	lhashset.add(40);
	lhashset.add(45);
	lhashset.add(null);
	Iterator<Integer> itr=lhashset.iterator();
	while (itr.hasNext()) {
		Integer i = (Integer) itr.next();
		System.out.println(i);
	}
}
}
