package com.day33;

import java.util.Scanner;

public class AvrageofDigits {

	public static void sum_digit(String str) {
	int sum=0;
	int count=0;
	for(int i=0;i<str.length();i++) {
		char ch= str.charAt(i);
		if(ch>='0'&& ch<='9') {
			count++;
			System.out.println(ch);
			int x=Character.getNumericValue(ch);
			sum=sum+x;
		}
	}
	System.out.println(sum/count);
}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String s=sc.next();
		
		CountCharacter.countCharacter(s);

	}

}
