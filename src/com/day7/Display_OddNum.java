package com.day7;

public class Display_OddNum {

	public static void main(String[] args) {
//		Display Odd Numbers:
		
		for(int i=1;i<=15;i++) {
			if(i%2==0) {
				continue;
			}
			System.out.println(i);
		}

	}

}
