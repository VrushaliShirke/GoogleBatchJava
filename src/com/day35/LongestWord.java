package com.day35;

public class LongestWord {
	
	public static void longestWord(String str) {
	
		String s[]= str.split(" ");
		String longestString="";
		
		for(int i=0;i<s.length;i++) {
			for(int j=i+1;i<s.length;i++) {
				if(s[i].length()>=s[j].length()) {
					longestString=s[i];
					
					System.out.println(longestString+" = "+s[i].length()+" characters.");
					
				}
			}
		}
	}

	public static void main(String[] args) {
		
		String s= "India is my country";
		
		LongestWord.longestWord(s);
	}

}
