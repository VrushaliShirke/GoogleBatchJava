package com.day24;

import java.util.Arrays;

public class MergeArrays {

	public static void main(String[] args) {
		int a1[]= {3,5,8,0};
		int a2[]= {7,6,9};
		int b=a1.length+ a2.length;
		int b1[]= new int[b];
		int count=0;
		
		System.out.println("First array:");
		for(int i=0;i<a1.length;i++) {
			b1[i]=a1[i];
			System.out.print(a1[i]+" ");
			count++;
		}
		System.out.println();
		System.out.println("Second array:");
		for(int i=0;i<a2.length;i++) {
			b1[count++]=a2[i];
			System.out.print(a2[i]+" ");
		}
		System.out.println();
		System.out.println("Merge array:");
		for(int i=0;i<b1.length;i++) {

			System.out.print(b1[i]+" ");
		}
		

	}

}
