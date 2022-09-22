package com.day5;
import java.util.Scanner;
public class DisplayNumber_5 {

	public static void main(String[] args) {
		// Table of number.
		
		try (Scanner sc = new Scanner(System.in)) {
			int num= sc.nextInt();
			int i;
			for(i=1;i<=10;i++) {
				int	table = num*i;
				System.out.println(table);
			}	
				sc.close();
		}
	}

}
