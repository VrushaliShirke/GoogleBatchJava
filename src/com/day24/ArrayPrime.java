package com.day24;

public class ArrayPrime {

	public static int prime_sum(int a[]) {
		int sum=0;
		for (int i=0;i<a.length;i++) {
			int n=a[i];
			boolean isPrime=true;
			for(int j=2;j<n;j++) {
				if(n%j==0) {
					isPrime= false;
					break;
				}
			}
			if(isPrime==true) {
				sum=sum+a[i];
			}
		}
		return sum;
	}
	public static boolean checkPrime(int n) {
		boolean isPrime=true;
		for(int i=2;i<n;i++) {
			if(n%i==0) {
				isPrime= false;
				break;
			}
		}
		return isPrime;
	}
	public static void main(String[] args) {
		int a[]= {7,5,43,65,22};
		System.out.println("Sum of primt from array="+prime_sum(a));
	}

}
