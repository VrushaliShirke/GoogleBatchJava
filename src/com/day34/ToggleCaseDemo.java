package com.day34;
import java.util.*;
public class ToggleCaseDemo {
	
	public static String convert_string(String str) {
		String myword="";
		for(int i=0;i<str.length();i++) {
			if(str.charAt(i)>='a'&& str.charAt(i)<='z') {
				myword=myword+((char)(str.charAt(i)-32));
			}
			else if (str.charAt(i)>='A'&& str.charAt(i)<='Z') {
				myword=myword+((char)(str.charAt(i)+32));
			}
			else {
				myword=myword+str.charAt(i);
			}
		}
		
		return myword;
	}
	
	public static String convert_case(String str) {
		String myword="";
		for(int i=0;i<str.length();i++) {
			if(Character.isUpperCase(str.charAt(i))) {
				myword=myword+Character.toLowerCase(str.charAt(i));
			}
			else if(Character.isLowerCase(str.charAt(i))) {
				myword=myword+Character.toUpperCase(str.charAt(i));
			}
			else {
				myword=myword+str.charAt(i);
			}
		}
		return myword;
	}

	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		System.out.println("Enetr the String: ");
		String s=sc.nextLine();
		
		System.out.println(ToggleCaseDemo.convert_string(s));
		System.out.println(ToggleCaseDemo.convert_case(s));
	}

}
