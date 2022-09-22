package com.day17;

class Engine{
	String type;
	
	Engine(String type){
		this.type=type;
	}
//	public void show_Engine() {
//		System.out.println(type);
//	}
	
	public String toString() {
		return type;
	}
}
class Gear{
	String gear;
	
	Gear(String gear){
		this.gear=gear;
	}
	public String toString() {
		return gear;
	}
}
public class Car {

	int model;
	String name;
	int price;
	Engine engine;
	Gear gear;
	Car(int model,String name,int price,Engine engine,Gear gear){
		this.model=model;
		this.name=name;
		this.price=price;
		this.engine=engine;
		this.gear=gear;
	}
//	void display_Car() {
//		System.out.println(model+" "+name+" "+price);
//		show_Engine();
//	}
	public String toString() {
		return model+" "+name+" "+price+" "+engine+" "+gear;
	}
	public static void main(String[] args) {
		Car c= new Car(34,"Audi",4500000,new Engine("Electrical"),new Gear("Stronic"));
		System.out.println(c);

	}

}
