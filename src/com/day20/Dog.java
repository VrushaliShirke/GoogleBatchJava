package com.day20;
class Animal{
	final int legs=4;
	
	public final void run() {
		System.out.println("Animal is running...");
	}
}

public class Dog extends Animal {

//	@Override
//	public final void run() {
//		
//	}
	public void show() {
		System.out.println(legs);
	}
	
	public static void main(String[] args) {
		Dog d= new Dog();
		d.show();

	}

}
