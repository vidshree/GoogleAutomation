package com.test;

public class StringComcept {

	public static void main(java.lang.String[] args) {
		
		// TODO Auto-generated method stub
		
String name="Vidya";
String name2="Shree";

System.out.println(name);
System.out.println(name2);
System.out.println(name.concat(name2));

String name3="APPLE";
String name4="banana";
String name5="apple";
String name6= "     Hello I am Vidya   ";
System.out.println(name3.length());
System.out.println(name3.toLowerCase());
System.out.println(name4.toUpperCase());
System.out.println(name4.length());
System.out.println(name5.replace('a', 'p'));
System.out.println(name5.replaceAll("pple", "nt"));
System.out.println(name3.equals(name5));
System.out.println(name3.equalsIgnoreCase(name5));
System.out.println(name3.charAt(4));
System.out.println(name3.contains("pp"));
System.out.println(name.endsWith("a"));
System.out.println(name4.hashCode());
System.out.println(name5.hashCode());
System.out.println(name6.trim());
System.out.println(name.contains("k"));
//stem.out.println(name.substring("0"));



	}

}
