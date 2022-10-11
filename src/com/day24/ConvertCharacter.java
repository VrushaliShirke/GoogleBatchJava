package com.day24;

import java.util.Arrays;

public class ConvertCharacter {

	public static void convertChar(char[] ch) {
		for(int i=0;i<ch.length;i++) {
			ch[i]=  (char) ((char)ch[i]-32);
		}
		System.out.println(Arrays.toString(ch));
	}
	public static void main(String[] args) {
		
		char ch[]={'f','s','y','w','a'};

		convertChar(ch);
	}

}
