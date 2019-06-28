package com.java.collection;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayListTest {
	public static void main(String[] args) {
		ArrayList<Integer> al = new ArrayList<Integer>();
		al.add(10);
		al.add(20);
		al.add(30);
		al.add(30);
		al.add(null);
		//al.add("a");
		al.add(25);
		System.out.println("Length=" + al.size());
		for (Integer i : al) {
			System.out.print(i + " ");

		}
		System.out.println();
		al.add(1, 15);
		for (Integer i : al) {
			System.out.print(i + " ");

		}
		System.out.println();
		System.out.println("Getting Index 1: "+al.get(1));
		al.remove(5);
		for (Integer i : al) {
			System.out.print(i + " ");

		}
		Collections.sort(al);
		System.out.println();
		for (Integer i : al) {
			System.out.print(i + " ");

		}

	}
}
