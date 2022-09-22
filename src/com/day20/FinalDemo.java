package com.day20;

public class FinalDemo {

	final int x; //blank final variable
	FinalDemo(){
		x=45;
	}
	void put() {
//		x=20;
	}
	void show() {
		System.out.println("x "+x);
	}
	public static void main(String[] args) {
		
		FinalDemo d= new FinalDemo();
		d.show();
	}

}
