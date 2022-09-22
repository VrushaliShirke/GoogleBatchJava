package com.day3;
import java.util.Scanner;
public class Ternary_pn0 {

	public static void main(String[] args) {
		// result = condition ? true : false;
		
		// ternary operator- Positive and Negative number.
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the number");
		int num= sc.nextInt();
		
		String result= num>0?"Positive":num<0?"Negative":"Zero";
		System.out.println(result);
		sc.close();
	}
}
