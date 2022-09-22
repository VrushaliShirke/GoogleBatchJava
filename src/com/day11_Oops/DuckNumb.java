package com.day11_Oops;
import java.util.Scanner;
public class DuckNumb {
	
	public void duckNum() {
		int sum=0;
		boolean duck=false;
		int r=0,num=0;
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
		
	}
	
	public static void main(String[] args) {
		DuckNumb d= new DuckNumb();
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the value");
		int n= sc.nextInt();
		d.duckNum();
		
		
	}
	
}
