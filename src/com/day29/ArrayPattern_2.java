package com.day29;

public class ArrayPattern_2 {
	
	public static void arrayPattern(char ch[][]) {
		for(int i=ch.length-1;i>=0;i--) {
			for(int j=ch.length-1;j>=i;j--) {
				ch[i][j]='*';
			}
		}
		for(int i=ch.length-1;i>=0;i--) {
			for(int j=ch.length-1;j>=i;j--) {
				System.out.print(ch[i][j]+" ");
			}
			System.out.println();
		}
	}

	public static void main(String[] args) {
		
		char ch[][]=new char[4][4];

		arrayPattern(ch);
	}

}
