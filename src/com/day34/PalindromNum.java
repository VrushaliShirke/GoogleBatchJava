package com.day34;
import java.util.*;
public class PalindromNum {
	
	public static void palindromNum(String str) {
		StringBuffer sb=new StringBuffer(str);
		sb.reverse();
		String s=sb.toString();
		if(str.equals(s)) {
			System.out.println("Palindron Number");
		}
		else {
			System.out.println("Not palindrom number");
		}
	}

	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the number:");
		String s=sc.next();

		PalindromNum.palindromNum(s);
	}

}
