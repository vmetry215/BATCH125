package com.java.oops;
abstract class Browser{
	public void display(){
		System.out.println("Non Abstract Method in Abstract Class");
	}
	public abstract void close();
	public abstract void resize();
	public abstract void minimize(int a,int b);
}
class Chrome extends Browser{

	@Override
	public void close() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void resize() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void minimize(int a, int b) {
		// TODO Auto-generated method stub
		
	}

	
}
class InternetExplorer extends Browser{

	@Override
	public void close() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void resize() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void minimize(int a, int b) {
		// TODO Auto-generated method stub
		
	}
	
}
public class AbstractTest {

}
