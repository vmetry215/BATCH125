package com.java.oops;
class FinalA{
	public final void add(int a,int b){
		System.out.println(a+b);
	}
	public void add(int a,float b){
		System.out.println(a+b);
	}
}
class FinalB extends FinalA{
//	public void add(int a,int b){//can overload/cannot override
//		System.out.println(a+b);
//	}
	
}
final class FinalC{
	
}
//class FinalD extends FinalC{//cannot inherite
//	
//}
public class FinalTest {
	public static void main(String[] args) {
		final int i=10;
		//i=20;
				
	}
}
