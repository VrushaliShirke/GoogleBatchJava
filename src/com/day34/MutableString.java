package com.day34;

public class MutableString {

	public static void main(String[] args) {
		
		StringBuffer sb= new StringBuffer();
		sb.append("Hello");
		System.out.println(sb);
		
		sb.append("Java");
		System.out.println(sb);
		
		sb.insert(3, "#");
		System.out.println(sb);
		
		sb.reverse();
		System.out.println(sb);

	}

}
