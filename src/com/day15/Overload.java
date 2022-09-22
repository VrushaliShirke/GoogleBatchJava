package com.day15;

public class Overload {
	float PI=3.14f;
	
	public void area(float r) {
		System.out.println("Area of circle= "+(PI*r*r));
	}
	public void area(int a) {
		System.out.println("Area of square= "+(a*a));
	}
	public void area(float l,float b) {
		System.out.println("Area of rectangle= "+(l*b));
	}
	public void area(int b,int h) {
		System.out.println("Area of square= "+((h*b)/2));
	}

	public static void main(String[] args) {
		Overload o= new Overload();
		o.area(4.5f);
		o.area(4);
		o.area(3.5f, 7.00f);
		o.area(12, 5);
	}

}
