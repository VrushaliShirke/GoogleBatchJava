package com.day34;

public class StringOut {
	public static void stringOut(String str) {
		
		char ch[]=str.toCharArray();

		for(int i=0;i<ch.length;i++) {
			if(ch[i]>='A'&& ch[i]<='Z') {
				System.out.print(ch[i]+" ");
			}
			if(ch[i]>='0'&& ch[i]<='9') {
				System.out.print(ch[i]+"\n");
			}
		}
	}

	public static void main(String[] args) {
		
//		Scanner sc= new Scanner(System.in);
		String st= "A+3,B+7,C+4,D+2";
		
		StringOut.stringOut(st);
		
	}

}
