package com.day5;
import java.util.Scanner;
public class SwitchEvenOdd {

	public static void main(String[] args) {
		// Even-odd Program using switch.
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the number");
		int num= sc.nextInt();
		
		
		switch(num%2) {
		case 0: System.out.println("even");
		break;
		case 1: System.out.println("odd");
			
		sc.close();
		}

	}
}

