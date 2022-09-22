package com.day10;

public class Series_6 {

	public static void main(String[] args) {
		// 1,9,25,49
		int cube=0;
		for(int i=1;i<=7;i++) {
			if(i%2==1) {
				cube=i*i;
				System.out.println(cube);
			}
		}

	}

}
