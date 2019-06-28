package com.java.oops;

interface Bank { // template of a class(static,constant and abstract methods)
	int i = 10;

	public void getInterest(int loan);
}

class IDBI implements Bank {
	public void getPersonalLoan() {
		System.out.println("IDBI Personal Loan");
	}

	@Override
	public void getInterest(int loan) {
		// TODO Auto-generated method stub
		System.out.println("From IDBI");
	}

}

class ICICI implements Bank {

	@Override
	public void getInterest(int loan) {
		// TODO Auto-generated method stub
		System.out.println("From ICICI");
	}

}

public class InterfaceTest {
	public static void main(String[] args) {
		IDBI idbi=new IDBI();
		idbi.getPersonalLoan();
		idbi.getInterest(10);
		
		Bank bank=new IDBI();
		bank.getInterest(20);
		bank=new ICICI();
		
		bank.getInterest(30);
		
		//dynamic object
		(new IDBI()).getPersonalLoan();
		
		
	}
	
}
