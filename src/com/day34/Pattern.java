package com.day34;
import java.util.*;
public class Pattern {
	
	public static void pattern(String str) {
		String s[]=str.split(" ");
		String myword="";
		for(int i=0;i<s.length;i++) {
			myword= myword+s[i]+" ";
			System.out.println(myword);
		}
	}

	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		System.out.println("Enetr the String");
		String s=sc.nextLine();
		Pattern.pattern(s);
	}

}
