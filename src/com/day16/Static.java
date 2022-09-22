package com.day16;

public class Static {

	static int x;
	
	public static void accept(int x) {
		Static.x=x;
	}
	
	public void show() {
		System.out.println(x);
	}
	public static void main(String[] args) {
		
		accept(10);
		new Static().show();

	}

}
