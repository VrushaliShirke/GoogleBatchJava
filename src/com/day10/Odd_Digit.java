package com.day10;
import java.util.Scanner;
public class Odd_Digit {

	public static void main(String[] args) {
		// Calculate avg of odd digit from number
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number:");
		int num=sc.nextInt();
		int sum=0,add=0,avg=0,count=0;
		
		while(num>0) {
			int r=num%10;
			if(r%2==1) {
				count++;
				add=add+r;
			}
			sum=sum+r;
			num=num/10;
		}
				avg=add/count;
				System.out.println(avg);
	}

}
