package com.day24;

public class CountDuplicates {
	
	public static int countDuplicates(int a[]) {
		int count=0;
		for(int i=0;i<a.length-1;i++) {
			for(int j=i+1;j<a.length;j++) {
				if(a[i]==a[j]) {
					count++;
				}
			}
		}
		System.out.println("Number of duplicates= "+count);
		return count;
	}

	public static void main(String[] args) {
		int a[]= {4,3,56,3,10,9,2,56,10};
		
		countDuplicates(a);

	}

}
