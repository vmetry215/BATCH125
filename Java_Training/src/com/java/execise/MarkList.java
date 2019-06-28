package com.java.execise;

public class MarkList {
	int rollno;
	String name;
	int sub1, sub2, sub3, total;
	float avg;

	public MarkList(int r, String n, int s1, int s2, int s3) {
		rollno = r;
		name = n;
		sub1 = s1;
		sub2 = s2;
		sub3 = s3;

	}

	public int getTotal() {
		return (sub1 + sub2 + sub3);

	}

	public float getAvg(int total) {
		return (total / 3);
	}

	public void display() {
		System.out.println("Roll no= " + rollno);
		System.out.println("Name= " + name);
		System.out.println("Subject 1= " + sub1);
		System.out.println("Subject 2= " + sub2);
		System.out.println("Subject 3= " + sub3);
		total = getTotal();
		avg = getAvg(total);
		System.out.println("Total= " + total);
		System.out.println("Average= " + avg);
	}

	public static void main(String[] args) {
		MarkList Student1 = new MarkList(101, "bala", 70, 85, 66);
		MarkList Student2 = new MarkList(102, "ravi", 75, 65, 80);
		Student1.display();
		Student2.display();
		System.out.println(Student1.name + Student1.total);
		System.out.println(Student2.name + Student2.total);
	}
}
