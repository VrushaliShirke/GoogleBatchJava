package com.day15;
import java.util.Scanner;
public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the number");
		int num= sc.nextInt();
		int d1 = 1, d2 = 0;
		int result=0,multi=1;
		
		while(num/10>0) {
			int r=num%10;
			if(r==d1) {
				result=result+d2*multi;	
			}
			else {
				result=result+r*multi;
			}
			multi=multi*10;
			num=num/10;
		}
//		System.out.println(num);
		if(num==d1) {
			result=result+ d2*multi;
			
		}
		else {
			result=result+ num*multi;
		}
	System.out.println(result);
	}

}
