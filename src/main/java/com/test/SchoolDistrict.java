package com.test;

public class SchoolDistrict extends SchoolStaff {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		SchoolDistrict sd= new SchoolDistrict();
		sd.computers();
		sd.biotechnology();
		sd.cafetaria();
		sd.electrical();
		sd.music();
		sd.teachers();
	
		

	}
	
	
	public void  computers() {
		System.out.println("Welcome to  Computer science branch");
		
		
	}
	
	public void electrical()
	{
		System.out.println(" Welcome to Electrical Branch");
	}
	
	public void biotechnology()
	{
		System.out.println("welcome to Biotech");
	}

}
