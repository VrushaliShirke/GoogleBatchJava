package com.day32.String;

public class Demo2 {

	public static void main(String[] args) {
		
		String str="Hello";
		String str2="Hello";
		
//		System.out.println(str==str2);
//		str=str+"Pune";
		
		String st2= new String("hello");
		System.out.println(str==str2);
		System.out.println(str==st2);
		System.out.println(st2.replace('e', 'a'));
		System.out.println(str.equals(st2));
		System.out.println(str.equalsIgnoreCase(st2));
		
		//+ve 1st string> 2nd string
		//-ve 1nd string< 2nd string
		//0 1st==2nd
		System.out.println(str.compareTo(st2));
		System.out.println(str.compareTo(str2));
	}

}
