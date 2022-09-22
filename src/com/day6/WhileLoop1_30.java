package com.day6;

public class WhileLoop1_30 {

	public static void main(String[] args) {
		// display numbers from 1 to 30 but skip the numbers divisible by 2,3 and 9.
		
//		for(int i=1;i<=30;i++) {			
//			if (i%2==0 || i%3==0 || i%9==0) {
//				
//				continue;
//			}
//			System.out.println(i);
//		}
		
		int i=1;
		while(i<=30) {
			
			if(i%2==0 || i%3==0 || i%9==00) {
				i++;
				continue;
				
			}
			System.out.println(i);
			i++;
		}
	}

}
