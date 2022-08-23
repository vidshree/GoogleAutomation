package com.test;

public class State extends India {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		State st=new State();
		st.ka();
		st.ts();
		st.ap();
		st.goa();

	}

	@Override
	public void ka() {
		// TODO Auto-generated method stub
		System.out.println("Welcome to Karnatka");
		
	}

	@Override
	public void ts() {
		// TODO Auto-generated method stub
		System.out.println("Welcome to Telangana");
		
		
	}

}
