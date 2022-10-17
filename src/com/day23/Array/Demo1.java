package com.day23.Array;
import java.util.*;
public class Demo1 {

	public static void main(String[] args) {
		
		//int a=3;int b=5;
		
		// ArrayCreation c= new ArrayCreation();System.out.println(c);
		
		int arr[]= {4,5,3,9};
		int a[]=new int [5];
//		a[0]=23;a[1]=56;a[2]=15;a[3]=29;a[4]=15;
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the array element");
		for(int i=0;i<a.length;i++) {
			a[i]=sc.nextInt();
		}
		System.out.println("..............................");
		
		for(int i=0;i<a.length;i++) {
			System.out.println(a[i]);
		}
		System.out.println("............................");
		for(int x:a) {
			System.out.println(x);
		}
		System.out.println(Arrays.toString(a));
	}

}
