package com.day16;

public class StaticDemo_2 {

	static int x=20;
	int y= 30;
	
	public void put() {
		System.out.println(x+" "+y);
		x=45;
	}
	public static void show() {
		StaticDemo_2 s= new StaticDemo_2();
		System.out.println(x+" "+s.y);
		s.put();
		}
	
	public static void main(String[] args) {
		new StaticDemo_2().put();
		StaticDemo_2.show();

	}

}
