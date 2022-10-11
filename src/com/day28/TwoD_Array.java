package com.day28;

import java.util.Scanner;

public class TwoD_Array {

	public static void main(String[] args) {
		int[][] arr= {{1,4,6},{7,3,1},{9,4,6}};
		int a[][]=new int[3][3];
		
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the array element:");
		for(int i=0;i<a.length;i++) {
			
			for(int j=0;j<a[i].length;j++) {
				a[i][j]=sc.nextInt();
			}	
		}
		System.out.println(".......................");
		for(int i=0;i<a.length;i++) {
			for(int j=0;j<a[i].length;j++) {
				System.out.print(a[i][j]+"  ");
			}
			System.out.println();
		}
		System.out.println("/////////////////////////////////");
		for(int x[]:a) {
			for(int y:x) {
				System.out.print(y+"  ");
			}
			System.out.println();
		}

	}

}
