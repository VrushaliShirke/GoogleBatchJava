
package com.day16;

public class StaticMethod {

	public static void mobile() {
		System.out.println("Samasung");
	}
	public static void mobile(int x) {
		
		System.out.println(x);
	}
	public static void mobile(String s) {
		
		System.out.println("Good Morning...! ");
	}
	public static void main(String[] args) {
		StaticMethod s= new StaticMethod();
		s.mobile();
		s.mobile(70);
		s.mobile("WELCOME");

	}

}
