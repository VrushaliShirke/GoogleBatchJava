package com.day16;

public class Static_Demo {

//	 int x=0;
	static int x=0;
	
	Static_Demo(){
		x++;
		System.out.println(x);
	}
	
	public static void main(String[] args) {
		Static_Demo e= new Static_Demo();
		Static_Demo e1= new Static_Demo();
		Static_Demo e2= new Static_Demo();

	}

}
