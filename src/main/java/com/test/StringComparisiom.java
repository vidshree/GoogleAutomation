package com.test;

public class StringComparisiom {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		String name="vidya";
		String name1="shree";
		String name2=new String("vidya");
		
		
		System.out.println(name==name2); ////it will compare the address of the reference
		System.out.println(System.identityHashCode(name));
		System.out.println(System.identityHashCode(name1));
		System.out.println(System.identityHashCode(name2));
		System.out.println(name.hashCode());
		System.out.println(name1.hashCode());
		System.out.println(name2.hashCode());
		System.out.println(name.equals(name2)); ////its going to compare the content
		
		
		
		
				
	}

}
