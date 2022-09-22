package com.day17;
import java.util.Scanner;
public class MissingNUm {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the number:");
		int num= sc.nextInt();
		int num1=sc.nextInt();
		int sum=0,add=0,missNum=0;
		while(num>0) {
			int r=num%10;
			sum=sum+r;
			num=num/10;
		}
		while(num1>0) {
			int r=num1%10;
			add=add+r;
			num1=num1/10;
		}
//		System.out.println(sum);
//		System.out.println(add);
		
		missNum = sum-add;
		System.out.println("Missing number is="+missNum);
	}
	
}
