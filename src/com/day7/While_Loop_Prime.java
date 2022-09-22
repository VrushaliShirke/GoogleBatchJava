package com.day7;

public class While_Loop_Prime {

	public static void main(String[] args) {
		// While loop prime numbers
		
		int num=1;
		
		while(num<=10) {
			int i=2;
			boolean isPrime=false;
			while(i<num) {
				if(num%i==0) {
					isPrime=true;
					break;
				}
				i++;
			}
			if(isPrime==false) {
				System.out.println(num);
			}
			num++;
		}
	}

}
