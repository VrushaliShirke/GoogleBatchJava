package com.day4;
import java.util.Scanner;
public class SwitchCalculator {

	public static void main(String[] args) {
		//Calculator
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the value");
		int num1= sc.nextInt();
		int num2= sc.nextInt();

		System.out.println("List of arithmetic operations:");
		System.out.println("1.Addition\n2.Subtraction\n3.Multiplication\n4.Division");
		
		int choice = sc.nextInt();
		
		switch(choice) {
		case 1: System.out.println("Addition of numbers="+(num1+num2));
		break;
		case 2: System.out.println("Subtraction of numbers="+(num1-num2));
		break;
		case 3: System.out.println("Multiplication of numbers="+(num1*num2));
		break;
		case 4: System.out.println("Division of numbers="+(num1/num2));
		break;
		default: System.out.println("Invalid number");
		}
		sc.close();
	}

}
