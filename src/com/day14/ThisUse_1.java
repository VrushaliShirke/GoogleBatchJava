package com.day14;

class Car{
	int model;
	String name;
	int price;
	
	public Car(int model,String name,int price) {
		this.model=model;
		this.name=name;
		this.price=price;
	}
	void display() {
		System.out.println(model+" "+name+" "+price);
	}
}

public class ThisUse_1 {

	public static void main(String[] args) {
		
		Car c= new Car(12,"Audi",5720000);
		c.display();

	}

}
