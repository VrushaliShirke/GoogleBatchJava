package com.day6;
import java.util.Scanner;
public class WhileLoop_DigitSum {

	public static void main(String[] args) {
		// Sum of digits:
		Scanner sc= new Scanner(System.in);
		System.out.println("Eneter the number");
		int num= sc.nextInt();
		int sum=0;
		
		while(num>0) {
			int r=num%10;
			sum=sum+r;
			num=num/10;
		}
				System.out.println(sum);
				
				sc.close();
	}

}
