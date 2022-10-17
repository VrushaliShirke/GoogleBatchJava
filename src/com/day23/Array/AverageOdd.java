package com.day23.Array;
import java.util.*;
public class AverageOdd {

	public static float odd(int[] a) {
		float avg=0f;
		int sum=0,count=0;
		for(int i=0;i<a.length;i++) {
			if(a[i]%2==1) {
				sum=sum+a[i];
				count++;
			}
		}
		avg= sum/count;
		return avg;
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of element");
		int n= sc.nextInt();
		
		System.out.println("Enetr the elements");
		int a[]= new int[n];
		//for input:
		for(int i=0;i<a.length;i++) {
			a[i]=sc.nextInt();
		}
		//for output:
		float result= AverageOdd.odd(a);
		System.out.println("Average of odd elements= "+result);

	}

}
