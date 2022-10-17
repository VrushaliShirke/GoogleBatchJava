package com.day23.Array;
import java.util.*;
public class SumArray {
	
	public static int sum(int[] a) {
		int sum=0;
		for(int i=0;i<a.length;i++) {
			sum=sum+a[i];
		}
		return sum;
	}

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the size of element");
		int n= sc.nextInt();
		
		System.out.println("Enter the element");
		int a[]= new int[n];
		//for enter the value:
		for(int i=0;i<a.length;i++) {
			a[i]=sc.nextInt();
		}
		//for output:
		
		int result= SumArray.sum(a);
		System.out.println("Sum of elements= "+result);
	}

}
