package com.test;

public class CountAlphanumspecialchar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s="Vidya1@shree@!5";
		int countAlpha=0;
		int spChar=0;
		int number=0;
		char a[]=s.toCharArray();
		for(int i=0;i<a.length;i++)
		{
			if((a[i]>=65 && a[i]<=90)||(a[i]>=97 && a[i]<=122))
			
			 countAlpha=countAlpha+1;
			
			else if((a[i]>=48 && a[i]<=57))
				number=number+1;
			else
				spChar=spChar+1;
			
		}
		
		System.out.println(countAlpha);
		System.out.println(spChar);
		System.out.println(number);
		//return 0;
		
	}

	
}
