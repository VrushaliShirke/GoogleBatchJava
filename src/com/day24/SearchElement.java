package com.day24;
import java.util.*;
public class SearchElement {
	
	public static boolean checkElement(int[] a,int n) {
		boolean isPresent= false;
		for(int i=0;i<a.length;i++) {
			if(a[i]==n) {
				isPresent= true;
				break;
			}
		}
		return isPresent;
	}
	
	public static int[] sortArray(int a[]) {
		for(int i=0;i<a.length;i++) {
			for(int j=i+1;j<a.length;j++) {
				if(a[i]< a[j]) {
					int temp= a[i];
					a[i]= a[i];
					a[j]=temp;
				}
			}
		}
		return a;
	}
	public static void main(String[] args) {
		
		int a[] = {4,7,3,9,7,5};
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the element for searching:");
		int num= sc.nextInt();
		
		boolean isPresent= SearchElement.checkElement(a,num);
		if(isPresent) {
			System.out.println("Element is present");
		}
		else {
			System.out.println("Element is not present in array");
		}
		
		sortArray(a);
	}

}
