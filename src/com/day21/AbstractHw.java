package com.day21;

abstract class Animal{
	int legs;
	abstract void show();
	
	Animal(int l){
		
		System.out.println("Dog is a animal having "+l+" legs");
	}
}
class Dog extends Animal{
	Dog(){
		super(4);
	}
	@Override
	void show() {
	System.out.println("It's a animal class");
	}
	
}
public class AbstractHw {

	public static void main(String[] args) {
//		Dog d= new Dog();
//		d.show();
		
		Animal a= new Dog();
		a.show();
	}

}
