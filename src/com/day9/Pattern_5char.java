package com.day9;

public class Pattern_5char {

	public static void main(String[] args) {
		// Character patter:
		
		for(char i='A';i<='D';i++) {
			for(char j='D';j>=i;j--) {
				System.out.print(j);
			}
			System.out.println();
		}

	}

}
