package com.day8;

public class Display_altNum {

	public static void main(String[] args) {
		// Display  alternate numbers for 65 to 75:
		
		for(int i=65;i<=75;i++) {
			if(i%2==0) {
				continue;
			}
			System.out.println(i);
		}

	}

}
