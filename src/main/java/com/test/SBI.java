package com.test;

public class SBI implements UniversalBank {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SBI sbi =new  SBI();
		sbi.businessLoan();
		sbi.educationLoan();
		sbi.goldLoan();

	}

	public void businessLoan() {
		// TODO Auto-generated method stub
		System.out.println(" SBI Business loan is 5%");
	}

	public void educationLoan() {
		// TODO Auto-generated method stub
		System.out.println(" SBI education loan is 8%");
	}

	public void homeLoan() {
		// TODO Auto-generated method stub
		System.out.println(" SBI home loan is 7.25%");
	}

	public void personalLoan() {
		// TODO Auto-generated method stub
		System.out.println(" SBI personal loan is 4%");
	}

	public void goldLoan() {
		// TODO Auto-generated method stub
		System.out.println(" SBI gold loan is 10%");
	}

	public void vehicleLoan() {
		// TODO Auto-generated method stub
		System.out.println(" SBI vehicle loan is 9%");
	}

	public void seniorCtz() {
		// TODO Auto-generated method stub
		System.out.println(" SBI Business loan is 2%");
	}

	public void sukanya() {
		// TODO Auto-generated method stub
		System.out.println(" SBI Business loan is 8.1%");
	}

	public void NRI() {
		// TODO Auto-generated method stub
		System.out.println(" SBI Business loan is 11%");
		
	}

}
