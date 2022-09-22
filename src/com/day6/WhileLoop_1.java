package com.day6;

public class WhileLoop_1 {

	public static void main(String[] args) {
		// Write a code even number between 1 to 20 if any number is divisible three stop to print the number
		
		int i=1;
		while(i<=20) {
			if(i%2==0) {
				if(i%3==0) {
					break;
				}
				i++;
				System.out.println(i);
			}
		}

	}

}
