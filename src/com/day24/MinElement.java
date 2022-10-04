package com.day24;
import java.util.*;
public class MinElement {

	public static int minvalue(int[] a) {
		
		int min= Integer.MAX_VALUE;
		for(int i=0;i<a.length;i++) {
			if(min>a[i]) {
				min=a[i];
			}
		}
		return min;
	}
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the element:");
		
		int a[]=new int[5];
		
		for(int i=0;i<a.length;i++) {
			a[i]=sc.nextInt();
		}
		System.out.println("Min element= "+minvalue(a));
		
	}

}
