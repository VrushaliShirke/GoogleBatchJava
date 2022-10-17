package com.day23.Array;
import java.util.*;
public class ReverseChar {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the size of element:");
		int n=sc.nextInt();
		
		System.out.println("Enter the element:");
		char arr[]= new char[n];
		//for elements:
		for(int i=0;i<arr.length;i++) {
			arr[i]=sc.next().charAt(0);
		}
		//for output:
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println();
		//for reverse order:
		for(int i=arr.length-1;i>=0;i--) {
			System.out.print(arr[i]+" ");
		}

	}

}
