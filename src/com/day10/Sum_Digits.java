package com.day10;
import java.util.Scanner;
public class Sum_Digits {

	public static void main(String[] args) {
		// Write a code to findout sum of 1st and last digit
		
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the number");
		int num= sc.nextInt();
		int i=1;
		int sum=0,firstDigit=0,lastDigit=0;
		
		lastDigit= num%10;
		while(num>=10) {
			 firstDigit= num/10; 
			 num=num/10;

		}
		sum=lastDigit+firstDigit;
		System.out.println(sum);
	}

}
