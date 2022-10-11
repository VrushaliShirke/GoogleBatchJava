package com.day31;

public class SecondHigh {
	
	public static int secondHigh(int a[]) {
		int max1=a[0];
		int max2=a[0];
		for(int i=0;i<a.length;i++) {
			if(max1<a[i]) {
				max2=max1;
				max1=a[i];
			}
			else if(a[i]>max2 && a[i]!=max1) {
				max2=a[i];
				
			}
		}
		return max2;
	}

	public static void main(String[] args) {
		
		int a[]= {77,3,44,52,100,67,94,22,1};
		
		int max2=SecondHigh.secondHigh(a);
		
		int sum=0;
		for(int i=0;i<a.length;i++) {
			if(a[i]<max2) {
				sum=sum+a[i];
			}
		}
		
		System.out.println(sum);
	}

}
