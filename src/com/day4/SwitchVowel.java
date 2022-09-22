package com.day4;
import java.util.Scanner;
public class SwitchVowel {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter:");
		char ch= sc.next().charAt(0);
		
		switch(ch) {
		case 'a': System.out.println("Vowel");
		break;
		case 'e': System.out.println("Vowel");
		break;
		case 'i': System.out.println("Vowel");
		break;
		case 'o': System.out.println("Vowel");
		break;
		case 'u': System.out.println("Vowel");
		break;
		default: System.out.println("Consonent");
		}
		sc.close();
		
		/*Another Method:
			switch(ch) {
			case 'a': 
			case 'e': 
			case 'i': 
			case 'o': 
			case 'u': System.out.println("Vowel");
			break;
			default: System.out.println("Consonent");
			} */
	}

}
