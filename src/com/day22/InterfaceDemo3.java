package com.day22;

interface Drawable{
	
	default void show() {
		
	}
}
interface Movable1 extends Drawable{
	void move();
	public int hashCode();
}
class Car1 implements Movable{
	public void move() {
		System.out.println("Car is moving...");
	}
	public void draw() {
		
	}
}

public class InterfaceDemo3 {

	public static void main(String[] args) {
		Car c= new Car();
		c.move();

	}

}
