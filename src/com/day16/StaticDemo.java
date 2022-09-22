package com.day16;

public class StaticDemo {

	static int x=20;
	
	public static void show() {
		System.out.println(x);
	}
	public static void main(String[] args) {
		
//		System.out.println(x);
//		out.println( new.StaticDemo().x);
		
		StaticDemo.show();
	}

}
