package com.test;

public class HDFC implements RBI, GoldVehicle{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HDFC hd=new HDFC();
		hd.businessLoan();
		hd.educationLoan();
		hd.homeLoan();
		hd.personalLoan();
		hd.goldLoan();
		
		

	}

	public void businessLoan() {
		// TODO Auto-generated method stub
		System.out.println("HDFC education Loan is 5%");
	}

	public void educationLoan() {
		// TODO Auto-generated method stub
		System.out.println("HDFC education Loan is 10%");
		
	}

	public void homeLoan() {
		// TODO Auto-generated method stub
		System.out.println("HDFC education Loan is 7.5%");
		
	}

	public void personalLoan() {
		// TODO Auto-generated method stub
		System.out.println("HDFC education Loan is 12%");
		
	}
	
	public void goldLoan()
	{
		System.out.println("HDFC education Loan is 8%");
	}

	public void vehicleLoan() {
		// TODO Auto-generated method stub
		
	}

}
