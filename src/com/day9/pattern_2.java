package com.day9;

public class pattern_2 {

	public static void main(String[] args) {
		// pattern:
		
		for(int i=1;i<=4;i++) {
			for(int k=5;k>i;k--) {
				System.out.print(" ");
			}
			for(int j=1;j<=i;j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

}
