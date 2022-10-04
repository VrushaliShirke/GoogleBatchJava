package com.day24;
import java.util.Scanner;
public class MaxInt {
	
	public static int maxInt(int a[]) {
		int max=a[0];
		for(int i=0;i<a.length;i++) {
			if(max<a[i]){
				max=a[i];
			}
		}
		return max;
	}

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int n=sc.nextInt();
		
		int a[]=new int[n];
		for(int i=0;i<a.length;i++) {
			a[i]=sc.nextInt();
		}
		
		System.out.println("Max Number= "+MaxInt.maxInt(a));
	}

}
