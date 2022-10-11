package com.day26;
import java.util.*;
class Student{
	int id;
	String name;
	int marks;
	Student(int id, String name,int marks){
		this.id=id;
		this.name=name;
		this.marks=marks;
	}
	public String toString() {
		return id+" "+name+" "+marks;
	}
}
public class StudentDemo {

	public static void main(String[] args) {
		Student st[]= new Student[3];
		Scanner sc=new Scanner(System.in);
		for(int i=0;i<st.length;i++) {
			System.out.println("Enter the id: ");
			int sid=sc.nextInt();
			System.out.println("Enter the name: ");
			String name=sc.next();
			System.out.println("Enter the marks: ");
			int marks=sc.nextInt();
			st[i]= new Student(sid,name,marks);
			
		}
		
		
		for(Student s:st) {
			System.out.println(s);
		}
	}

}
