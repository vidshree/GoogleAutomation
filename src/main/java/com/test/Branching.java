package com.test;

public class Branching {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		for(int i=1;i<=5;i++)
		{
			if(i==5)
			{
				break;
			}
			System.out.println(i);
		}
		
		
		for(int i=1;i<=8;i++)
		{
			if(i==5)
			{
				continue;
			}
			System.out.println(i);
		}	
		
		
	}

}
