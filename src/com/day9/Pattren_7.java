package com.day9;

public class Pattren_7 {

	public static void main(String[] args) {
		
		for(int i=1;i<=4;i++) {
			if(i%2==1) {
				for(int j=1;j<=i;j++) {
					System.out.print(j);
				}
				System.out.println();
			}
			else {
				for(char j='A';j<='D';j++) {
					System.out.print(j);
				}
				System.out.println();
			}
		}
		
	}

}
