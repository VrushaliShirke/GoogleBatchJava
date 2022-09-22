package com.day18;
class Laptop1{
	Laptop1(String RAM){
		System.out.println("Laptop"+" "+RAM);
	}
}
class Dell1 extends Laptop{
	Dell1(String s){
		super(s);
		System.out.println();
	}
}
public class SuperDemo3 {

	public static void main(String[] args) {
		
		Dell1 d= new Dell1("128 GB");

	}

}
