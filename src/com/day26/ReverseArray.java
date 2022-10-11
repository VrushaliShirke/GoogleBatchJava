package com.day26;

import java.util.Arrays;

public class ReverseArray {
	public static void reverseArray(int a[]) {
		int j= a.length-1;
		for(int i=0;i<a.length/2;i++) {
			int temp=a[i];
			a[i]=a[j];
			a[j]=temp;
			j--;
		}
		System.out.println(Arrays.toString(a));
	}

	public static void main(String[] args) {
		
		int a[]= {5,6,2,3,9,1};
		System.out.println(Arrays.toString(a));
		reverseArray(a);
	}

}
