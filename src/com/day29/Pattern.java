package com.day29;

public class Pattern {
	
	public static void patternTriangle(char ch[][]) {
		for(int i=0;i<ch.length;i++) {
			for(int j=0;j<ch.length;j++) {
				ch[i][j]='*';
			}
		}
		for(int i=0;i<ch.length;i++) {
			for(int j=0;j<ch.length;j++) {
				System.out.print(ch[i][j]+" ");
			}
			System.out.println();
		}
	}

	public static void main(String[] args) {
		
		char ch[][]= new char[3][3];
		patternTriangle(ch);
	}

}
