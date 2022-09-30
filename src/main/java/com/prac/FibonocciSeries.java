package com.prac;

public class FibonocciSeries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
/*		int n1=0,n2=1;
int count=0;
int n=10;
while(count<n)
{
	System.out.println(n1+ " ");
	int n3=n2+n1;
	n1=n2;
	n2=n3;
	count=count+1;
}

	}
	*/
	int N=10;
	for(int i=0;i<N;i++)
	{
		System.out.print (" " +fib(i)+ " ");
	}
	
	}
	
	
	
	static int fib(int n)
	{
		if(n<=1)
			return n;
		return fib(n-1)+fib(n-2);
		
	}
}
