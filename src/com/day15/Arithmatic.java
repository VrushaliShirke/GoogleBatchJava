package com.day15;

public class Arithmatic {

	public void addition(int a, int b){
		System.out.println("Addition= "+(a+b));
	}
	public void addition(float a, float b) {
		System.out.println("Addition= "+(a+b));
	}
	public void addition(int a,int b,int c) {
		System.out.println("Addition= "+(a+b+c));
	}
	public void subtraction(int x,int y) {
		System.out.println("sbtraction= "+(x-y));
	}
	public void subtraction(float x, float y) {
		System.out.println("subtraction= "+(x-y));
	}
	public void multi(int x) {
		System.out.println("Multiplication= "+(x*x));
	}
	public void multi(int x, int y) {
		System.out.println("Multiplication= "+(x*y));
	}
	public void division(int x, int y) {
		System.out.println("Division= "+(x/y));
	}
	public void division(int x,int y,int z) {
		System.out.println("Division= "+((x/y)/z));
	}
	
	public static void main(String[] args) {
		Arithmatic a= new Arithmatic();
		a.addition(45.34f, 74.35f);
		a.addition(45, 04);
		a.addition(34,22, 32);
		a.division(45, 3);
		a.division(500, 10, 5);
		a.multi(5);
		a.multi(40, 3);
		a.subtraction(45.23f, 35.40f);
		a.subtraction(45, 30);
	

	}

}
