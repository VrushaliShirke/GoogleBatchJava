package com.day29;

public class RowMax {
	
	public static void rowMax(int a[][]) {
		
		for(int i=0;i<a.length;i++) {
			int max=a[i][0];
			for(int j=0;j<a[i].length;j++) {
				if(a[i][j]>max) {
					max=a[i][j];
				}
				System.out.print(a[i][j]+" ");
			}
			System.out.print(" ="+max);
			System.out.println();
		}
		
	}

	public static void main(String[] args) {
		int a[][]= {{4,5,1},{7,8,6},{1,2,3}};
		rowMax(a);
	}

}
