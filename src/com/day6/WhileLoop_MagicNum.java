package com.day6;
import java.util.Scanner;
public class WhileLoop_MagicNum {

	public static void main(String[] args) {
		// Magic Number:
		
		int magic=67;
		Scanner sc=new Scanner(System.in);
		while(true) {
			System.out.println("Enter the number for gussing");
			int num= sc.nextInt();
			if(num<magic) {
				System.out.println("Number is less try again...");
				continue;
			}
			else if (num>magic) {
				System.out.println("Number is greater please try again...");
				continue;
			}
			else {
				System.out.println("Number is correct....");
				break;
			}
		
		}
		sc.close();
	}

}
