package com.day12;
import java.util.Scanner;
public class SumOfDigit {
	
	public int digit_sum(int n) {
		int sum=0;
		while(n>0) {
			int r=n%10;
			sum=sum+r;
			n=n/10;
		}
		return sum;
	}

	public static void main(String[] args) {
		
		SumOfDigit d= new SumOfDigit();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		int num = sc.nextInt();
		
		int result=d.digit_sum(num);
		System.out.println("Sum of Digit="+result);

	}

}
