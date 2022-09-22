package com.day17;

class Address{
	int pin;
	String city;
	
	Address(int pin,String city){
		this.pin=pin;
		this.city=city;
	}
	public String toString() {
		return pin+" "+city;
	}
	
//	void show_Address() {
//		System.out.println(pin+" "+city);
//	}
}
public class Person {

	int id;
	String name;
	Address adr;
	Person(int id,String name,Address adr){
		this.id=id;
		this.name=name;
		this.adr=adr;
	}
	public String toString() {
		return id+" "+name+" "+adr;
	}
	public static void main(String[] args) {
		Person p= new Person(23,"Neha",new Address(235637,"Pune"));
		System.out.println(p);

	}
//	void display_Person() {
//		System.out.println(id+" "+name+" ");
//		adr.show_Address();
//	}
}
