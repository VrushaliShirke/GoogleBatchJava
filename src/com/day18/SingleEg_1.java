package com.day18;
class Flower1{
	String color= "Red";
}
class Rose1 extends Flower1{
	void show() {
		System.out.println("color:"+color);
	}
}
public class SingleEg_1 {

	public static void main(String[] args) {
		Rose1 r= new Rose1();
		r.show();

	}

}
