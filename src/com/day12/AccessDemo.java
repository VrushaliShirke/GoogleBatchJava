package com.day12;

public class AccessDemo {

	public static void main(String[] args) {
		AccessModifier f= new AccessModifier();
//		System.out.println(f.x); //error private access only for same class
		
		System.out.println(f.num); //default
		System.out.println(f.z); //protected
		System.out.println(f.s); //public
	}

}
