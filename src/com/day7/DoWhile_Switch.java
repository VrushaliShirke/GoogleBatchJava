package com.day7;
import java.util.Scanner;
public class DoWhile_Switch {

	public static void main(String[] args) {
		// Do___While loop using switch case
		
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the first number:");
		int num1= sc.nextInt();
		System.out.println("Enter the second number:");
		int num2= sc.nextInt();
		
		char ch;
		do {
			System.out.println("1.Addition\n2.Subtraction\n3.Multiplication\n4.Division");
			System.out.println("Enter your choice");
			int choice= sc.nextInt();
		
		switch(choice) {
		case 1: System.out.println("Addition="+(num1+num2));
		break;
		case 2: System.out.println("Subtraction="+(num1-num2));
		break;
		case 3: System.out.println("Multiplication="+ (num1*num2));
		break;
		case 4: System.out.println("Division="+ (num1/num2));
		break;
		default: System.out.println("Invalid choice");
		} 
		
		System.out.println("Do you want to continue?");
		ch= sc.next().charAt(0);
		
		} while(ch=='y' || ch=='Y');
			
		sc.close();
	}
}
