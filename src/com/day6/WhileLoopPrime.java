package com.day6;
import java.util.Scanner;
public class WhileLoopPrime {

	public static void main(String[] args) {
		// Prime Numbers:
		
		Scanner sc= new Scanner(System.in);
		System.out.println("Eneter the number");
		int num= sc.nextInt();
		int i=2;
		boolean isPrime=true;
		while(i<num) {
			if(num%i==0) {
				isPrime=false;
				break;
			}
			i++;
		}
		if(isPrime==true) {
			System.out.println("Prime");
		}
		else {
			System.out.println("Non- prime");
		}
		sc.close();
	}

}
