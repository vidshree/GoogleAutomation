package com.test;

public class ReverseString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
/*
		String a="Vidya shree esturi";
		char ch[]=a.toCharArray();
		for(int i=ch.length-1;i>=0;i--)
		{
			System.out.print(ch[i]);
			
		}
		
	
 
		String a="Hello this is my World";
		String b=a.substring(0,5);
		System.out.println(b);
String c[]=a.split(a);
		System.out.println(c);*/
		
		String name="Hello i am Vidya";
		
		String[] sta=name.split(" ");
		String totalWordRev="";
		System.out.println(sta.length);
		System.out.println(sta[0]);
		System.out.println(sta[1]);
		System.out.println(sta[2]);
		System.out.println(sta[3]);
		
		
		for(int i=0;i<sta.length;i++)
		
		{
			String eachword=sta[i];
			String rev=" ";
		
			for(int j=eachword.length()-1;j>=0;j--)
			{
				rev=rev+eachword.charAt(j);
				
				
			}
			totalWordRev=totalWordRev+rev+" ";
			
		}
		System.out.println("Final output is: " +totalWordRev);
		
		
				
		

	}

}
