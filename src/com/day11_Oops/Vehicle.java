package com.day11_Oops;

public class Vehicle {
	String model;
	int number;
	int price;
	
	void acceptDetails(String mname,int mnumber,int p) {
		model=mname;
		number=mnumber;
		price=p;
	}
	void display() {
		System.out.println(model+" "+number+" "+price);
	}

	public static void main(String[] args) {
		Vehicle v= new Vehicle();
		v.acceptDetails("Audi", 56,6576700);
		v.display();

	}

}
