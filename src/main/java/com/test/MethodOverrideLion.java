package com.test;

public class MethodOverrideLion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MethodOverrideLion mol=new MethodOverrideLion();
mol.food();
mol.color();

	}
    
	public void food()
	{
		System.out.println("ITs a Non-Vegetarian");
	}
	
	public void color()
	{
		System.out.println(" ITs color is Yellow and Orange combination");
	}
}
