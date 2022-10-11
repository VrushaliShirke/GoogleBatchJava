package com.day29;

import java.util.Arrays;

public class Vararge {
	public static void show(String str,int... a) {
		System.out.println(str);
		System.out.println(Arrays.toString(a));
	}

	public static void main(String[] args) {
		
		show("Pune",10);
		show("TQ",3,5,6);
		show("Red",8,5);

	}

}
