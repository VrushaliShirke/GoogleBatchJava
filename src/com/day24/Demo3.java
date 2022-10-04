package com.day24;

import java.util.Arrays;

public class Demo3 {

	public static void alternate(char[] ch) {
		System.out.println(Arrays.toString(ch));
		
		for(int i=0;i<ch.length;i++) {
			if(ch[i]=='y'||ch[i]=='Y'||ch[i]=='Z'||ch[i]=='z') {
				ch[i]=(char)(ch[i]-24);
			}
			else {
				ch[i]=(char)(ch[i]+2);
			}
		}
		System.out.println("...........................");
		System.out.println(Arrays.toString(ch));
		
	}
	public static void main(String[] args) {
		
		char ch1[]= {'e','a','x','j','r'};
		Demo3.alternate(ch1);
	}
}
