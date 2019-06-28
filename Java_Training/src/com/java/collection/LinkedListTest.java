package com.java.collection;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListTest {
	public static void main(String[] args) {
		LinkedList<Integer> l =new LinkedList<Integer>();
		l.add(10);
		l.add(20);
		l.add(20);
		l.add(null);
		l.add(3, 30);
		l.removeLast();
		
		Iterator<Integer> itr=l.iterator();
		while (itr.hasNext()) {
			Integer i = (Integer) itr.next();
			System.out.println(i);
		}
	}
}
