package com.day24;
import java.util.*;
public class SeparateArray {
	
	public static void divideArray(int[] a) {
		int even=0;
		for(int i=0;i<a.length;i++) {
			if(a[i]%2==0) {
				even++;
			}
		}
		int b[]=new int[even];
		int c[]=new int[a.length-even];
		int j=0,k=0;
		for(int i=0;i<a.length;i++) {
			if(a[i]%2==0) {
				b[j]=a[i];
				j++;
			}
			else {
				c[k]=a[i];
				k++;
			}
		}
		System.out.println();
		System.out.println("Even= "+Arrays.toString(b));
		System.out.println("Odd= "+Arrays.toString(c));
	}
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enetr the value");
		int n= sc.nextInt();
		
		int a[]=new int[n];
		for(int i=0;i<a.length;i++) {
			a[i]=sc.nextInt();
		}
		System.out.println("Original array:" );
		for(int i=0;i<a.length;i++) {
			System.out.print(a[i]+" ");
		}
		divideArray(a);
	}

}
