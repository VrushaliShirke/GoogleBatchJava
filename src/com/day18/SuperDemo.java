package com.day18;

class Flower{
	String color ="Red";
	void show() {
		System.out.println("flower");
	}
}
class Rose extends Flower{
	String color="Black";
	
//	void show() {
//		System.out.println("Rose Color="+super.color+" "+color);
//	}
	
	void show() {
		System.out.println("Rose");
		super.show();
	}
}

public class SuperDemo {

	public static void main(String[] args) {
		
		Rose r= new Rose();
		r.show();

	}

}
