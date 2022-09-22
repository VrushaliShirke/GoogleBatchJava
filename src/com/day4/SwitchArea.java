package com.day4;
import java.util.Scanner;
public class SwitchArea {

	public static void main(String[] args) {
		// Write a program for area of circle,triangle, rectangle, square.
		
		Scanner sc= new Scanner(System.in);
		System.out.println("List of shape for calculate area:");
		System.out.println("1.Circle\n2.Triangle\n3.Rectangle\n4.Square");
		int shape= sc.nextInt();
		
		switch(shape) {
		case 1:
			int radius1= sc.nextInt();
			float PI=3.14f,areaC;
			areaC=(float) PI*radius1*radius1;
			System.out.println("Area of circle= "+areaC);
		break;
		case 2:
			int h= sc.nextInt();
			System.out.println("h="+h);
			int b= sc.nextInt();
			System.out.println("b="+b);
			float areaT= (h+b)/2f;
			System.out.println("Area of Triangle= "+areaT);
		break;
		case 3:
			int l= sc.nextInt();
			System.out.println("l="+l);
			int w= sc.nextInt();
			System.out.println("w="+w);
			int areaR= l*w;
			System.out.println("Area of Rectangle="+areaR);
		break;
		case 4:
			int a= sc.nextInt();
			System.out.println("a="+a);
			int areaS= a*a;
			System.out.println("Area of Square="+areaS);
			break;
		default: System.out.println("Invalid number");
		sc.close();
		}
	}
}