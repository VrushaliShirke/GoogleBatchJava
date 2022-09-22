package com.day16;

public class Main_static {

	static {
		System.out.println("Block1");
	}
	Main_static(){
		System.out.println("Default");
	}
	
	{
		System.out.println("My initializer block");
	}
	
	public static void main(String[] args) {
		
		System.out.println("main");
		
		Main_static m= new Main_static();
		Main_static m1= new Main_static();
		Main_static m2= new Main_static();
	}
	static {
		System.out.println("Block2");
	}

}
