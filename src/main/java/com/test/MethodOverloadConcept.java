package com.test;

public class MethodOverloadConcept {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		MethodOverloadConcept tml=new MethodOverloadConcept();
		tml.vehicle(4);
		tml.vehicle("bus", 50);
		tml.vehicle("bike", 2);
	}

		public void vehicle()
		{
			System.out.println(" People can travel in vehicle");
		
		}
		public void vehicle(int persons )
		{
			System.out.println(" No of persons:" +persons);
			
				
		}
		public void vehicle(String VehicalName, int persons)
		{
			System.out.println("Vehicle is : " +VehicalName+", "  + "No of Persons can travel is " +persons);
			
		}
		
		
	

}
