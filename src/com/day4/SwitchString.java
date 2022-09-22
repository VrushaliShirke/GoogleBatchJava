package com.day4;
import java.util.Scanner;
public class SwitchString {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter:");
		String input= sc.next();
		
		switch(input) {
		case "happy": System.out.println("Happy");
		break;
		case "new": System.out.println("New");
		break;
		case "year": System.out.println("Year");
		break;
		default: System.out.println("Welcome");
		}
		sc.close();
	}

}
