package com.day33;
import java.util.*;
public class CountWords {

	public static void countWords(String str) {
		int count=1;
		char ch[]= new char[str.length()];
		for(int i=0;i<str.length();i++){
			if(((i>0)&& ch[i]!=' ')&& ((i==0)&&(ch[i]!=0))){
				count++;
			}
		}
		System.out.println(count);
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String s= sc.nextLine();
		CountWords.countWords(s);
	}

}
