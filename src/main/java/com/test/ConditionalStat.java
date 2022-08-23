package com.test;

public class ConditionalStat {

	public static void main(String[] args) {
		//int a=10,b=5;
	/*	if(b>a)
		{
			System.out.println(" a value is big:" +a);
			
		}
		else
		{
			System.out.println("b value is big:" +b);
		} */
		// TODO Auto-generated method stub
		
	int a=100;
		int b=670;
		int c=340;

		
		if ((a>b) && (a>c))
		{
			System.out.println("a value is big:" +a);
			
		}
		else if(b>c)
		{
			System.out.println("b value is big:"+b);
			
		}
		else
		{
			System.out.println("c value is big:' +c");
		}

	}

}
