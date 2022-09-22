package com.day20;
class Student3{
	int id;
	String name;
	final void std(int id) {
		id=34;
//		System.out.println("Enter your id");
	}
	final void std(String name) {
		name="Ishita";
//		System.out.println("Enter your name");
	}
	void show() {
		System.out.println(id+" "+name);
	}
}
public class OverloadFinal {

	public static void main(String[] args) {
		Student3 s= new Student3();
		s.show();

	}

}
