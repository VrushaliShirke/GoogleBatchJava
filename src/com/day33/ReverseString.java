package com.day33;
import java.util.*;
public class ReverseString {
	
	public static String reverse(String str) {
//		String s1=" ";
//		for(int i=0;i<str.length();i++) {
//			s1=str.charAt(i)+s1;
//		}
//		for(int i=str.length()-1;i>=0;i--) {
//			s1=s1+str.charAt(i);
//		}
//		char ch[]=str.toCharArray();
//		for(int i=ch.length-1;i>=0;i--) {
//			s1=s1+ch[i];
//		}
//		char ch[]=str.toCharArray();
//		int j=ch.length-1;
//		for(int i=0;i<ch.length/2;i++) {
//			char temp=ch[i];
//			ch[i]=ch[j];
//			ch[j]=temp;
//			j--;
//		}
//		String s2= new String(ch);
//		
//		return s2;
		
//		String revers=" ";
		String rev="";
//		String s[]=str.split(" ");
//		
//		for(int i=0;i<s.length;i++) {
//			String word=s[i];
//			for(int j=word.length()-1;j>=0;j--) {
//				rev=rev+word.charAt(j);
//			}
////			revers=revers+" ";
//			rev=rev+" ";
//		}
////		return revers;
		return rev;
		
		
		

	}

	public static void main(String[] args) {
		
//		System.out.println("Enter the string:");
		Scanner sc= new Scanner(System.in);
//		String st=sc.nextLine();
		
//		System.out.println(ReverseString.reverse(s));

		String s="India is my country";
//		String str1[]=s.split("\\s");
		String str1[]=s.split("is");
		for(String st2:str1) {
			System.out.println(st2);
		}
		sc.close();
	}

}
