package com.java.controlstatement;

public class ConditionStatement {
	public static void main(String[] args) {
		for (int i = 4; i <= 7; i++) {
			System.out.println(i);
			if (i == 7) {
				i = 0;
				//System.out.println(i);
			}
			if (i == 3) {
				break;
			}
		}
	}
}
