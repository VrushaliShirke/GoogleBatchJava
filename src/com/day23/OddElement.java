package com.day23;
import java.util.*;
public class OddElement {
	
	public static int odd(int[] arr) {
		int count=0;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]%2==1) {
				count++;
			}
		}
		return count;
	}

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the size of elements");
		int n=sc.nextInt();
		
		System.out.println("Enter the elements");
		int arr[]=new int[n];
		//for element:
		for(int i=0;i<arr.length;i++) {
			arr[i]= sc.nextInt();
		}
		//for output:
		int result= OddElement.odd(arr);
		System.out.println("Count of odd element= "+ result);

	}

}
