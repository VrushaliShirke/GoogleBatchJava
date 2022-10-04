package com.day20;
class Vehical{
//	public Animal show() {
//		return new Animal();
//	}
	
//	public Object show() {
//		String s="Hello";
//		return s;
//	}
	
	public Number salary(){
		return 23000;
	}
}

class Car extends Vehical{
	
//	@Override
//	public Dog show() {
//		return new Dog();
//	}
	
//	public String show() {
//		return "Pune";
//	}
	
	public Float salary() {
		
		return 423.43f;
	}
	void msg() {
		System.out.println("Hello");
	}
}
public class CoverientDemo {

	public static void main(String[] args) {
		new Car().msg();
		

	}

}
