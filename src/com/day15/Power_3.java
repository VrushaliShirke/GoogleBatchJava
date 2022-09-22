package com.day15;
import java.util.Scanner;
public class Power_3 {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the number");
		int num= sc.nextInt();
		int r=0;
		boolean isPower=true;
		while(num>2) {
		if(num%3!=0) {
			isPower=false;
		}
		num=num/3;
		}
		if(isPower==true) {
			System.out.println("Power of 3");
		}
		else {
			System.out.println("Not power of 3");
		}
		
		
		
		
		
		
		
//		boolean isPower=true;
//		while(num>0) {
//			r= num%3;
////			if(r==1||r==2) {
////				break;
//////				isPower=false;
////			}
//			num=num/3;
////		}
//		if(r%3==0) {
//			System.out.println(" Power of 3");
//		}
//		else {
//			System.out.println("not power of 3");
//		}
		
		
	}

}
