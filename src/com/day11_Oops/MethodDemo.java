package com.day11_Oops;
import java.util.Scanner;
public class MethodDemo {
	float price=56;
	
	// Access_Specifier return type method name()
	//{
		//logic
	//}
	
//	1. no return_type no parameter
	
	public void show() {
		System.out.println("Show method");
	}
	//2.no return_type with parameter
			public void addition(int x,float y) {
					float result=x+y;
					System.out.println("Addition="+result);
//					System.out.println("Addition="+ result);
			}
	//3. with return type no parameter
			public float sendPrice() {
				return price;
			}
	//4. with return _type with parameter
			public double area(int r,double PI) {
				//return(r*r*PI);
				double a=r*r*PI;
				return a;
				}
		
	public static void main(String[] args) {
		System.out.println("hii");
		MethodDemo d= new MethodDemo();
		d.show();
		System.out.println("main");
		
		d.addition(45, 10);
		
		/*float ans= d.sendPrice();
		System.out.println("Price="+ans);*/
		System.out.println("price="+d.sendPrice());
		
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the value");
		int radius=sc.nextInt();
		double PI=3.14;
		double circle_Area=d.area(radius, PI);
		System.out.println("Area of circle="+circle_Area);
		System.out.println("Area= "+d.area(9, 3.14));
		
	}
	
		
				
				
	
}
