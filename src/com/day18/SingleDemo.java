package com.day18;

class Animal{
	int legs=4;
}
class Dog extends Animal{
	void show() {
		System.out.println("Dog has "+legs+" legs");
	}
}
public class SingleDemo {

	public static void main(String[] args) {
		Dog d= new Dog();
		d.show();

	}

}
