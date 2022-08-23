package com.test;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class CollectionSetJava {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Set<String> st=new HashSet<String>();
		st.add("Rama");
		st.add("Krishna");
		st.add("Gopi");
		st.add("Murali");
		System.out.println(st.size());
		System.out.println(st);
		st.add("Krishna");
		st.add("Gopi");
		System.out.println(st);
		Iterator<String> it=st.iterator();
		while(it.hasNext())
			
		{
			System.out.println(it.next());
		}
		
		

	}

}
