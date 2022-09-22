package com.day8;
import java.util.Scanner;
public class Krishnamurti_Number {

	public static void main(String[] args) {
		// Krishnamurti Number
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		int num= sc.nextInt();
		int num1=num;
		int sum=0,r;
		
		while(num>0) {
			int fact=1;
			r=num%10;
			for(int i=1;i<=r;i++) {
				fact=fact*i;
			}
			sum=sum+fact;
			num=num/10;
		}
		System.out.println(sum);
		if(sum==num1) {
			System.out.println("Krishnamurti Number");
		}
		else {
			System.out.println("Not krishnamurti number");
		}
		sc.close();
	}

}
