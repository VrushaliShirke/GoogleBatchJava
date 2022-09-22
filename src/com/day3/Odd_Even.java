package com.day3;
import java.util.Scanner;
public class Odd_Even {
	public static void main(String[] args) {
		// Odd and Even
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the number");
		int num = sc.nextInt();
		
		if(num%2==0) {
			System.out.println("Number is even.");
		}	
			else	
			System.out.println("Number is odd.");
		sc.close();
	}
}
