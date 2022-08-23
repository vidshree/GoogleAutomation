package com.test;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class CollectionList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<String> lt=new ArrayList<String>();
		lt.add("Vidya");
		lt.add("Ritu");
		lt.add("rama");
		lt.add("krishna");
		lt.add("hanuma");
		lt.add("Shiva");
		System.out.println(lt.size());
		System.out.println(lt.get(2));
		System.out.println(lt);
		lt.add("Vidya");
		lt.add("Ritu");
		System.out.println(lt);
		
		
		Iterator<String> ite = lt.iterator();
			while(ite.hasNext())
			{
				System.out.println(ite.next());
			}
	}

}
