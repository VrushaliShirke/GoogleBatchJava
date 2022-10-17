package com.day26;
import java.util.*;
public class PositionArray {
	
	public static void positionArray(int a[],int n) {
		int i=0;
		for( i=0;i<a.length;i++) {
			if(a[i]==n) {
				break;
			}
		}
		System.out.println("Position of "+n+" is="+i);
	}

	public static void main(String[] args) {
		
		int a[]= {3,5,2,9,7,5,3,5};
		Scanner sc= new Scanner(System.in);
		int num=sc.nextInt();
		
		positionArray(a,num);
	}

}
