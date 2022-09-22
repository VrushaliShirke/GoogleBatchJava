package com.day3;
import java.util.Scanner;
public class Ternary_even_odd {

	public static void main(String[] args) {
		// Ternary operator- even and odd
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the number: ");
		int num= sc.nextInt();
		
		String result= num%2==0?"Even":"Odd";
		System.out.println(result);
		sc.close();
	}

}
