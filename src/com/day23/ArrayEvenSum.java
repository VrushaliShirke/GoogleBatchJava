package com.day23;
import java.util.*;
public class ArrayEvenSum {

	public static int even_sum(int[] a) {
		int sum=0;
		for(int i=0;i<a.length;i++) {
			if(a[i]%2==0) {
				sum=sum+a[i];
			}
		}
		return sum;
	}
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int arr[]=new int[6];
		System.out.println("Eneter the arry elements");
		for(int i=0;i<arr.length;i++) {
			arr[i]=sc.nextInt();
		}

		int result= ArrayEvenSum.even_sum(arr);
		System.out.println("Sum of even elements= "+result);
	}

}
