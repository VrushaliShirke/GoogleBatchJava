package com.day21;

interface Printable{
	int x=12;
	void print();
	
	default void show() {
		System.out.println("Show method");
	}
	static void edit() {
		System.out.println("Edit before print....");
	}
}
class Document implements Printable{
	public void print() {
		System.out.println("Document is printed....");
	}
}

public class InterfaceDemo {

	public static void main(String[] args) {
		Printable p=new Document();
		p.print();
		System.out.println(p.x);
		p.show();
		Printable.edit();

	}

}
