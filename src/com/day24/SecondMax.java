package com.day24;

public class SecondMax {
	public static int secondMax(int[] a) {
		int max=Integer.MIN_VALUE;
		
		for(int i=0;i<a.length-1;i++) {
			if(max<a[i]) {
				max=a[i];
			}
		}
		return max;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a[]= {9,3,55,31,75,99};		
		System.out.println("Max element= "+secondMax(a));
	}

}
