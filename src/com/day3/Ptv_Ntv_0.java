package com.day3;
import java.util.Scanner;
public class Ptv_Ntv_0 {

	public static void main(String[] args) {
		// Write code to check number is positive, negative or zero.
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the number: ");
		int num= sc.nextInt();
		
		if(num>0) {
			System.out.println("Number is positive.");
		}
		else if(num<0){
			System.out.println("Number is negative.");
		}
		else {
			System.out.println("Zero");
		}
		sc.close();
	}
	
}
