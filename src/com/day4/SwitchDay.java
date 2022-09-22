package com.day4;
import java.util.Scanner;
public class SwitchDay {

	public static void main(String[] args) {
		// Write a program for day number and display it's day name
		Scanner sc= new Scanner(System.in);
		System.out.println("List of days");

		System.out.println("1.Sunday\n2.Monday\n3.Tuesday\n4.Wensday\n5.Thursday\n6.Friday\n7.Saturday");
		int day= sc.nextInt();
		
		switch(day) {
		case 1: System.out.println("Sunday");
		break;
		case 2:System.out.println("Monday");
		break;
		case 3: System.out.println("Tuesday");
		break;
		case 4: System.out.println("Wensday");
		break;
		case 5: System.out.println("Thursday");
		break;
		case 6: System.out.println("Friday");
		break;
		case 7: System.out.println("Saturday");
		}
		sc.close();
	}

}
