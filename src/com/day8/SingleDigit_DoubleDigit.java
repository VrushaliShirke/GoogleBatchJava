package com.day8;
import java.util.Scanner;
public class SingleDigit_DoubleDigit {

	public static void main(String[] args) {
		//Single Digit or Double digit:
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the number");
		int num= sc.nextInt();
		int sum=0;
		int count=0;
		
		while(num>0) {
			int r= num%10;
			sum= sum+r;
			num= num/10;
			count++;
		}
		if(count==1) {
			System.out.println("Single digit");
		}
		else if (count==2){
			System.out.println("Double digit");
		}
		else {
			System.out.println("Your digits are="+count);
		}
		sc.close();
	}

}
