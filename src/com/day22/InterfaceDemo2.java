package com.day22;

@FunctionalInterface
interface Movable{
	void move();
	public int hashCode();
}
interface Drawble extends Movable{
	void draw();
}
class Car implements Movable{
	public void move() {
		System.out.println("Car is moving...");
	}
	public void draw() {
		
	}
}
public class InterfaceDemo2 {

	public static void main(String[] args) {
		
		Car c= new Car();
		c.move();

	}

}
