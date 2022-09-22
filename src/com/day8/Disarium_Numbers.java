package com.day8;
import java.util.Scanner;
public class Disarium_Numbers {

	public static void main(String[] args) {
		// Check number Disarium or not:
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		int num= sc.nextInt();
		int r;
		int sum=0;
	
		int copy=num;
		String s= Integer.toString(num);
		int len= s.length();
		
		while(num>0) {
			
			r= num%10;
			sum=sum+(int)(Math.pow(r,len));
			len--;
			num=num/10;
	
			
		}
		if(sum==copy) {
			System.out.println("Desarium");
		}
		else {
			System.out.println("Not desarium");
		}
		sc.close();
		
	}

}
