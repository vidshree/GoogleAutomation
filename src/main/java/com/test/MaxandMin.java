package com.test;

public class MaxandMin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a[]= {50,20,30,55,60};
		
		int max=a[0];
		for(int i=1; i<a.length;i++)
		{
			if(a[i]>max)
			{
				max=a[i];
			}
			
		}
		System.out.println("Maximum value is:" +max);
		
		
		
		
		
	int min=a[0];
	for(int j=1;j<a.length;j++)
	{
		if(a[j]<min)
		{
			min=a[j];
		}
	}
	System.out.println("Minimum value is:" +min);
	
	
	}

}
