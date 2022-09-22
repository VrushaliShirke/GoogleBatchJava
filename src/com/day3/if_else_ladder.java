package com.day3;
import java.util.Scanner;
public class if_else_ladder {

	public static void main(String[] args) {
		// Use capital vowel letters
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the letter");
		char ch=sc.next().charAt(0);
		if(ch=='A') {
			System.out.println("Vowel");
		}
		else if(ch=='E') {
			System.out.println("Vowel");
		}
		else if(ch=='I') {
			System.out.println("Vowel");
		}
		else if(ch=='O') {
			System.out.println("Vowel");
		}
		else if(ch=='U') {
			System.out.println("Vowel");
		}
		else {
			System.out.println("Consonants");
		}
		sc.close();
	}

}
