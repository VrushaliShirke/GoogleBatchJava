package com.day29;
import java.util.*;
public class ColumnMin {
	
	public static void columnMin(int[][] a) {
		for(int i=0;i<a.length;i++) {
			int min=a[0][i];
			for(int j=0;j<a[i].length;j++) {
				if(a[i][j]<min) {
					min=a[i][j];
				}
				System.out.print(a[i][j]+" ");
			}
			System.out.print(" ="+min);
			System.out.println();
		}
	}

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enetr the number of elements:");
		int row=sc.nextInt();
		int column=sc.nextInt();
		
		int a[][]= new int[row][column];
		for(int i=0;i<a.length;i++) {
			for(int j=0;j<a[i].length;j--) {
			a[i][j]=sc.nextInt();tfd
		}
			columnMin(a);
		}
	}

}
