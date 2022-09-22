package com.day18;

class Vehical{
	int wheels;
	void show() {
		System.out.println("Vehical");
	}
}
class Car extends Vehical{
	void show() {
		wheels=4;
		System.out.println(wheels);
	}
}
class Truck extends Vehical{
	void show() {
		wheels=12;
		System.out.println("Truck "+wheels);
	}
}
public class HeirarchicalDemo {

	public static void main(String[] args) {
		
//		Car c= new Car();  c.showCar(); Truck t= new Truck(); t.showTruck();
		
		Vehical v= new Truck();
		v.show();
	}

}
