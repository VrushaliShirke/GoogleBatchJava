package com.day34;
import java.util.*;
public class ShortName {
	
	public static void shortName(String str) {
		
		int lastPosition= str.lastIndexOf(' ');
		
		for(int i=0;i<lastPosition;i++) {
			if(str.charAt(i)== ' ') {
				System.out.print(str.charAt(i+1)+".");
			}
		}
		System.out.print(str.substring(lastPosition));
	}

	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		System.out.println("Eneter the string: ");
		String s=sc.nextLine();
		
		s=" "+s;
		ShortName.shortName(s);
	}

}
