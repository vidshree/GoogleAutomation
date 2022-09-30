package com.test;

public class RemoveSpecialCharacters {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s1= "@Vidyashree$%^$%$%Esturi";
		
	String	 s2=s1.replaceAll("[^a-zA-Z0-9]", " ");
		System.out.println(s2);
		
		
		s2=s2.replaceAll("\\s", "");
		System.out.println("After removing White spaces:" +s2);
		
	}

}
