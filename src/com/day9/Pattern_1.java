package com.day9;

public class Pattern_1 {

	public static void main(String[] args) {
		// Pattern of number
		
		for(int i=1;i<=4;i++) {
			for(int j=4;j>=i;j--) {
				System.out.print(j);
			}
			System.out.println();
		}

	}

}
