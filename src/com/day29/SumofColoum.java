package com.day29;

public class SumofColoum {
	
	public static void sumofColoum(int[][] a) {
		int c[]= new int[a.length];
		int k=0;
		for(int i=0;i<a.length;i++) {
			int sum=0;
			for(int j=0;j<a[i].length;j++) {
				sum= sum+a[j][i];
				System.out.print(a[i][j]+" ");
			}
//			System.out.print(" ="+sum);
			c[k]=sum;
			k++;
			System.out.println();
			
		}
		for(int i=0;i<a.length;i++) {
			System.out.print(c[i]+" ");
		}
	}

	public static void main(String[] args) {
		
		int[][] a= {{1,2,3,},{4,5,6},{7,8,9}};
		
		sumofColoum(a);
	}

}
