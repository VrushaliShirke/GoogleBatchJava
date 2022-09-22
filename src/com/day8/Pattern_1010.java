package com.day8;

public class Pattern_1010 {

	public static void main(String[] args) {
		// 1010 number pattern
		
		for(int i=1;i<=4;i++) {
			for(int j=1;j<=i;j++) {
				if(j%2==0) {
					System.out.print("0");
				}
				else {
					System.out.print("1");
				}
			
			}
			System.out.println();
		}
	}

}
