package com.prac;

public class DuplicateArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int  a[]={1,3,3,7,8,8,9};
		for(int i=0;i<a.length;i++)
		for(int j=i+1;j<a.length;j++)
			if(a[i]==a[j])
			
				System.out.println("duplicate is :" +a[j]);
			
	}
		

}
