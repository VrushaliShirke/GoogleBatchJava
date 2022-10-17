package com.day34;
import java.util.*;
public class SortedByLength {
	
	public static void sort_length(String str) {
		String s[]= str.split("\\s");
		
		for(int i=0;i<s.length;i++) {
			for(int j=i+1;j<s.length;j++) {
				if(s[i].length()>s[j].length()) {
					String temp= s[i];
					s[i]=s[j];
					s[j]=temp;
				}
				else if(s[i].length()==s[j].length()) {
					if((s[i].compareTo(s[j])<0)) {
						String t = s[i];
						s[i]=s[j];
						s[j]=t;
					}
				}
			}
		}
		System.out.println(Arrays.toString(s));
	}

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enetr the string: ");
		String s=sc.nextLine();
		SortedByLength.sort_length(s);

	}

}
