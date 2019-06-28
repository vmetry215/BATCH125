package com.java.exception;


public class ThrowsTest {
	public void display() throws InterruptedException{
		Thread.sleep(5000);
	}
	public void display1() throws InterruptedException{
		display();
	}
	public static void main(String[] args) throws InterruptedException {
		System.out.println("hai");
		Thread.sleep(5000);
		System.out.println("hai");
	}
}
