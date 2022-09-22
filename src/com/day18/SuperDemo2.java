package com.day18;
class Laptop{
	Laptop(String RAM){
		System.out.println("Laptop"+" "+RAM);
	}
}
class Dell extends Laptop{
	Dell(){
		super("128 GB");
		System.out.println();
	}
}
public class SuperDemo2 {

	public static void main(String[] args) {
		
		Dell d=new Dell();

	}

}
