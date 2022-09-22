package com.day11_Oops;

public class Car {
	int model;
	String name;
	int price;
	void acceptDetails(int m,String cname,int p) {
		model=m;
		name=cname;
		price=p;
	}
	
	void display() {
		System.out.println(model+" "+name+" "+price+" ");
	}
	public static void main(String[] args) {
		Car c=new Car();
		c.acceptDetails(324772,"Audi",23942093);
		c.display();
		System.out.println();
	}
}
