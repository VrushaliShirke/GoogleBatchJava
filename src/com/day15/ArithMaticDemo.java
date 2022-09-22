package com.day15;

public class ArithMaticDemo {

	public void addition(int x, int y) {
		System.out.println(x+y);
	}
	
	public void addition(int x, int y,int z) {
		System.out.println("Addition of 3="+(x+y+z));
	}
	
	public float addition(float x, int z) {
		return x+z;
	}
	
	public void addition(float a, float b) {
		System.out.println("Addition of float,float="+(a+b));
	}
	
	public void addition(int x) {
		System.out.println("Addition of single="+(x+3));
	}
	
	
	public static void main(String[] args) {
		ArithMaticDemo a= new ArithMaticDemo();
		a.addition(4);
		a.addition(34.2f, 45.2f);
		a.addition(34.22f, 76.9f);
		a.addition(35, 76);
		a.addition(34, 76, 10);
	}

}
