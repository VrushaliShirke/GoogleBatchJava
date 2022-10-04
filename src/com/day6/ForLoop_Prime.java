package com.day6;
import java.util.Scanner;
public class ForLoop_Prime {

	public static void main(String[] args) {
		// Prime numbers using for loop:
		Scanner sc= new Scanner(System.in);
		int num= sc.nextInt();
		
		int i;
		for( i=2;i<=num;i++) {
			
		if(num%i==0) {
			System.out.println("prime");
		}
		else {
			System.out.println("non-prime");
		}
		
		sc.close();
		}
	}

}
