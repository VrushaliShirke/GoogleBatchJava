package com.day29;

public class RowMin {
	
	public static int rowMin(int n[][]) {
		
		for(int i=0;i<n.length;i++) {
			int min=n[i][0];
			for(int j=0;j<n[i].length;j++) {
				if(n[i][j]<min) {
					min=n[i][j];
				}
				System.out.print(n[i][j]+" ");
			}
			System.out.print(" ="+min);
			System.out.println();
		}
		return 0;
	}

	public static void main(String[] args) {
		int a[][]= {{4,3,5,75},{97,32,1,87}};
		rowMin(a);
	}

}
