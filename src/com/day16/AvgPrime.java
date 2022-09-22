package com.day16;

public class AvgPrime {
	
	public void prime(){
		int sum=0;
		int count=0,num=0;
		for( num=2;num<=20;num++) {
			boolean isPrime=true;
			int n=num;
			for(int i=2;i<n;i++) {
				if(n%i==0) {
					isPrime=false;
					break;
				}
			}
			if(isPrime==true) {
				sum=sum+num;
				count++;
//				System.out.println("num="+num);
//				System.out.println("sum="+sum);
			}
		}
		System.out.println("Total count="+count);
		System.out.println("Sum of prime nunbers="+sum);
		double avg=(sum/count);
		System.out.println("Average of prime numbers="+avg);
		
	}
		
	public static void main(String[] args) {
		// WAC to find avg of prime numbers from 1 to 20.
		AvgPrime a= new AvgPrime();
		a.prime();
		
	}
}
