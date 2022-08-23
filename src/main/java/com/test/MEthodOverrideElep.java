package com.test;

public class MEthodOverrideElep  extends MethodOverrideLion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 MEthodOverrideElep moe = new  MEthodOverrideElep();
		 moe.food();
		 moe.color();
		 moe.weight();
		 

	}
	
	public void food()
	{
		System.out.println("ITs a Vegetarian");
	}
	
	public void color()
	{
		System.out.println(" ITs color is Gray");
	}
	
	public void weight()
	{
		System.out.println(" Its weight is above 300KGS");
		
	}

}
