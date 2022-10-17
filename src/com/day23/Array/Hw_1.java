package com.day23.Array;
import java.util.*;
public class Hw_1 {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Eneter the size of elements");
		int n=sc.nextInt();
		
		float a[]= new float[n];
		
		// for enter the numbers:
		System.out.println("Enter the elements");
		for(int i=0;i<a.length;i++) {
			a[i]=sc.nextFloat();
		}
		
		//for display the output:
		System.out.println("Output:");
		for(int i=0;i<a.length;i++) {
			System.out.println(a[i]);
		}
	}

}
