package com.day35;

public class LongestWord {
	
	public static void longestWord(String str) {
	
		String largestWord="";
		String s[]= str.split("\\s");
		for(int i=0;i<s.length;i++) {	
				if(s[i].length()>=largestWord.length()) {
					largestWord=s[i];
				}
		}
		System.out.println("Largest word is: "+largestWord+" & Length of word is = "+largestWord.length());
	}
	public static void main(String[] args) {
		
		String s= "India is my country";
		
		LongestWord.longestWord(s);
	}

}
