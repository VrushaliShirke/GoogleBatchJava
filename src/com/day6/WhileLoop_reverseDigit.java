package com.day6;
import java.util.Scanner;
public class WhileLoop_reverseDigit {

	public static void main(String[] args) {
		// Reverse digits of a number:
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the number:");
		int num= sc.nextInt();
		int reverse=0;
		
		while(num>0) {
			int r=num%10;
			reverse= reverse*10+r;
			num=num/10;
		}
		System.out.println(reverse);
		
		sc.close();
	}

}
