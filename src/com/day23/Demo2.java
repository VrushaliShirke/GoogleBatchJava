package com.day23;
import java.util.*;
public class Demo2 {

	public static void main(String[] args) {
		
		char ch[]= {'e','y','T','u'};
		
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the array size");
		int n=sc.nextInt();
		char ch1[]=new char[n];
		System.out.println("Enter the char element");
		
		for(int i=0;i<ch1.length;i++) {
			ch1[i]=sc.next().charAt(0);
		}
		System.out.println("......................");
		
		for(int i=0;i<ch1.length;i++) {
			System.out.println(ch1[i]);
		}
		System.out.println("////////////////////////////");
		
		for(char c:ch1) {
			System.out.print(c+" ");
		}
	}

}
