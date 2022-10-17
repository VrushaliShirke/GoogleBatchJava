package com.day35;
import java.util.*;
public class DeleteChar {
	
	public static void deleteChar(String str1,String str2) {
	
		
		String new_String=str1.replace(str2,"");
		System.out.println(new_String);
	}
	public static void main(String[] args) {
	
//		String s1="India";
//		String s2="In";
		
		Scanner sc= new Scanner(System.in);
		String s1=sc.nextLine();
		String s2=sc.nextLine();
		DeleteChar.deleteChar(s1,s2);
	}

}
