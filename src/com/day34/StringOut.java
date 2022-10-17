package com.day34;

public class StringOut {
	public static void stringOut(String str) {
		
		char ch[]=str.toCharArray();
//		char ch2[]=str.toCharArray();
		for(int i=0;i<ch.length;i++) {
			if(ch[i]>='A'&& ch[i]<='Z') {
				System.out.print(ch[i]+" ");
			}
			if(ch[i]>='0'&& ch[i]<='9') {
				System.out.print(ch[i]+"\n");
			}
//			System.out.println();
		}
		
		
//		String s[]=str.split(",");
//		
//		for(int i=0;i<str.length();i++) {
//			
//			if(s[i].charAt(i)=='A'||s[i].charAt(i)=='B'||s[i].charAt(i)=='C'||s[i].charAt(i)=='D') {
//				
//				for(int j=0;j<s[i].length();j++) {
//					
//					if(s[i].charAt(j)>='0'&& s[i].charAt(j)<='9') {
//						int a=Character.getNumericValue(s[i].charAt(j));
//						System.out.println(s[i]+"  "+s);
//					}
//				}
//			}
//		}

	}

	public static void main(String[] args) {
		
//		Scanner sc= new Scanner(System.in);
		String st= "A+3,B+7,C+4,D+2";
		
		StringOut.stringOut(st);
		
	}

}
