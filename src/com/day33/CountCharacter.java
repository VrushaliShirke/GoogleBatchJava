package com.day33;
import java.util.*;
public class CountCharacter {
	
	public static void countCharacter(String str) {
		int count=0;
		for(int i=0;i<str.length();i++) {
			count++;
		}
		System.out.println("number of characters= "+count);
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String s=sc.next();
		
		CountCharacter.countCharacter(s);

	}

}
