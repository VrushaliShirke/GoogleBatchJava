package com.day7;

public class For_Loop_Prime {

	public static void main(String[] args) {
		// Prime Numbers:
		
		for(int num=1;num<=10;num++) {
			int n=num;
			boolean isPrime=true;
			for(int i=2;i<n;i++) {
				if(n%i==0) {
					isPrime=false;
					break;
				}
			}
			if(isPrime==true) {
				System.out.println(n);
			}
		}

		
		
//		for(int num=1;num<=10;num++) {
//			int n=num;
//			boolean isPrime=true;
//			for(int i=2;i<n;i++) {
//				if(n%i==0) {
//					 isPrime=false;
//					 break;
//				}
//			}
//			if(isPrime==true) {
//				System.out.println(n);
//			}
//		}
	}

}
