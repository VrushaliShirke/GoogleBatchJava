package com.day24;
import java.util.*;
public class MaxElement {

	public static char maxChar(char ch[]) {
		char max= ch[0];
		
		for(int i=0;i<ch.length;i++) {
			if(max<ch[i]) {
				max= ch[i];
			}
		}
		return max;
	}
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the elements:");
		char ch[]=new char[5];
		
		for(int i=0;i<ch.length;i++) {
			ch[i]=sc.next().charAt(0);
		}
		System.out.println("Max char from array= "+MaxElement.maxChar(ch));
		
	}

}
