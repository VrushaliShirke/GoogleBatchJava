package com.day4;
import java.util.Scanner;
public class AgeofFriend {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the age");
		int myAge= sc.nextInt();
		int friendAge= sc.nextInt();
		System.out.println("My age="+ myAge);
		System.out.println("My friend age="+friendAge);
		
		if (myAge>friendAge) {
			System.out.println("Hi");
		}
		else if(myAge<friendAge) {
			System.out.println("Hello");
		}
		else if(myAge==friendAge) {
			System.out.println("Hi...Hello");
		}
		sc.close();
	}

}
