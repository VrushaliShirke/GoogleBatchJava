package com.day11_Oops;
import com.day12.AccessModifier;
public class AccessOutPackage2 extends AccessModifier {

	public static void main(String[] args) {
		AccessModifier a= new AccessModifier();
//		System.out.println(a.x); //private- can't access
//		System.out.println(a.num); //default- can't access
//		System.out.println(a.z);// protected- can't access
		System.out.println(a.s); //public
		
		AccessOutPackage2 p=new AccessOutPackage2();
		System.out.println(p.z);
		System.out.println(p.s);

	}

}
