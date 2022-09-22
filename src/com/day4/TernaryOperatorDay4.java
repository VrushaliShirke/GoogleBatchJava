package com.day4;
import java.util.Scanner;
public class TernaryOperatorDay4 {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the values:");
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		int num3 = sc.nextInt();
		
		int result= num1>(num2>num3? num2:num3)? num1: (num2>num3? num2:num3);
		System.out.println(result);
		
		//int max=(num1>num2 && num1>num3)?num1:(num2>num1 && num2>num3);
		//System.out.println(max);
		sc.close();
	}

}
