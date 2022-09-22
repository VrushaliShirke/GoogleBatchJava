package com.day11_Oops;
import java.util.Scanner;
public class DuckNum {

	public static void main(String[] args) {
		// Duck numbar:
		
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the value");
		int num= sc.nextInt();
		boolean duck=false;
		int r=0,sum=0;
		while(num/10>0) {
			r=num%10;
			if(r==0) {
				duck=true;
			}
			sum=sum+r;
			num=num/10;	
		}
//		System.out.println(r);
		if(r!=0) {
				if(duck==true) {
					System.out.println("Duck number");
				}
				else {
					System.out.println("not duck number");
				}
		}
				sc.close();

	}

}
