package com.day6;
import java.util.Scanner;
public class WhileLoop_counterPrime {

	public static void main(String[] args) {
		// Prime number using counter.
		Scanner sc= new Scanner(System.in);
		System.out.println("Eneter the number:");
		int num= sc.nextInt();
		int i=2;
		int count=0;
		while(num>i) {
			if(num%i==0) {
				count++;
				break;
			}
			i++;
		}
		if(count==0) {
			System.out.println("prime");
		}
		else {
			System.out.println("non-prime");
		}
		sc.close();
	}

}
