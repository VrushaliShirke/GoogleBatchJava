package com.day10;
import java.util.Scanner;
public class Automorphic {

	public static void main(String[] args) {
		// check number automorphic or not. e.g.5^2==>25,25^2==>625;
		
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the number:");
		int num= sc.nextInt();
		String s= Integer.toString(num);
		
		int sqr= num*num;
		String s1=Integer.toString(sqr);
		
		if(s1.endsWith(s)) {
			System.out.println("Automorphic");
		}
		else {
			System.out.println("not automorphic");
		}

	}

}
