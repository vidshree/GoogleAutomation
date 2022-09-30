package com.test;

public class OccuranceChar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String name="vidyashree";
		char ch[]=name.toCharArray();
	for(int i=0;i<ch.length;i++)
		
	{
		int count=0;
		for(int j=0;j<ch.length;j++)
		{
		 if(ch[i]==ch[j])
		 {
			 count++;
		 }
		 
	    }
System.out.println(ch[i]+ " occured:" +count );
		
		

	}

	}
	
}

