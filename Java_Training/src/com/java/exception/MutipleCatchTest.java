package com.java.exception;

public class MutipleCatchTest {
	public static void main(String[] args) {

		try {
			// System.out.println(5/0);
			int a[] = { 10, 20, 30, 40 };
			System.out.println(a[10]);
		} catch (Exception e) {
			System.out.println("handling exception");
		}
		// catch(ArrayIndexOutOfBoundsException e){
		// }
		// System.out.println("out of range");
		// }catch(ArithmeticException e){
		// System.out.println("Divided by zero");
		// }
		System.out.println("Done");
	}
}
