package com.day3;
import java.util.Scanner;
public class TernaryGreatestNo {

	public static void main(String[] args) {
		// Greatest number between two numbers-
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the number:");
		//int num1= sc.nextInt(), num2= sc.nextInt();
		
//		int result= num1>num2? num1:num2;
//		System.out.println(result);

		int num1=sc.nextInt(),num2=sc.nextInt(),num3=sc.nextInt();
		
		int result= num1>((num2>num3)? num2:num3)? num1:((num2>num3)? num2:num3);
		System.out.println(result);
		sc.close();
	}

}
