package com.day20;
class Student1{
	int id;
	String name;
	static void std(int id){
		System.out.println("Enter your ID");
	}
	static void std(String name) {
		System.out.println("Enter your name");
	}
}
public class OverloadStatic {

	public static void main(String[] args) {
		Student1 s= new Student1();
		s.std(2444442);
		s.name(",mwk");

	}

}
