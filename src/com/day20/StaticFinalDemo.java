package com.day20;

public class StaticFinalDemo {

	static final int x;
	static final int y;
	static {
		x=78;
		y=45;
	}
	void put() {
		
	}
	void show() {
		System.out.println("x "+x);
	}
	public static void main(String[] args) {
		FinalDemo d= new FinalDemo();
		d.show();

	}

}
