package com.day6;

public class WhileLoop_EvenNum {

	public static void main(String[] args) {
		// Even number using while loop
		
		int i=1;
		while(i<=20) {
			if(i%2==0) {
				if(i%3==0) {
					break;
				}
			System.out.println(i);
			i++;
			}
			
		}

	}

}
