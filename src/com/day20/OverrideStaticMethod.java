package com.day20;

class Student{
	static int id;
	
	public static void sId(int id) {
		System.out.println("Student id");
	}
}
class Java extends Student{
	public static void sId(int id) {
		System.out.println("Welcome in to Java");
	}
}
public class OverrideStaticMethod {
	
	
	public static void main(String[] args) {
		Student s= new Student();
		s.sId(3432);

	}

}
