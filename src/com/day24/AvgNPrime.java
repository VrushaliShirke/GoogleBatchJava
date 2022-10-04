package com.day24;
import java.util.*;
public class AvgNPrime {
	
	public static int nonPrime(int a[]) {
		int avg=0;
		int sum=0,count=0;
		for (int i=0;i<a.length;i++) {
			int n=a[i];
			boolean isPrime=true;
			for(int j=2;j<n;j++) {
				if(n%j==0) {
					isPrime= false;
					count++;
					break;
				}
			}
			if(isPrime==false) {
				sum=sum+a[i];
			}
		}
		avg=sum/count++;
		return avg;
	
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
		
		int a[]= {3,6,4,17,45,19};
		
		System.out.println("Sum of Non prime numbers="+AvgNPrime.nonPrime(a));
		

	}

}
