package com.day3;
import java.util.Scanner;
public class GreatestNum {

	public static void main(String[] args) {
		// Greatest number between three numbers
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the numbers= ");
		int num1= sc.nextInt(), num2= sc.nextInt(), num3= sc.nextInt();
		System.out.println(num1+","+num2+","+num3);
		
		if(num1>num2) {
			if(num1>num3) {
				System.out.println("Greatest number= "+num1);
			}
		}
		if(num1<num2) {
			if(num2>num3) {
				System.out.println("Greatest number= "+num2);
			}
		}
		if(num3>num1) {
			if(num3>num2) {
				System.out.println("Greatest number= "+num3);
			}
		}
		sc.close();
	}

}
