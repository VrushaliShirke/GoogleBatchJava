package com.day12;
import java.util.Scanner;
public class Student {
	private int sid;
	int addYear;
	protected String name;
	public int result;
	
	public void setId(int sid) {
		this.sid=sid;
	}
	public int getId() {
		return sid;
	}
	
	void addmissionYear(int Y) {
		addYear=Y;
	}
	
	void stdname(String sname) {
		name=sname;
	}
	public int result(int sresult) {
		 return result= sresult;
	}
//	void display() {
//		System.out.println(sid+" "+addYear+" "+name+" "+result);
//	}
	
	public static void main(String[] args) {
		Student std= new Student();
		Scanner sc=new Scanner(System.in);
		int studentId= sc.nextInt();
		std.setId(studentId);
//		System.out.println("Student ID="+std.sid);
		
		int addmissionYear= sc.nextInt();
		std.addmissionYear(addmissionYear);
//		System.out.println("Addmission Year="+std.addYear);
		
		String stdname= sc.next();
		std.stdname(stdname);
//		System.out.println("Student name="+std.name);
		
		int stdResult= sc.nextInt();
		std.result(stdResult);
//		System.out.println("Student result="+std.result+"%");
		
		System.out.println(studentId+" "+addmissionYear+" "+stdname+" "+stdResult+"%");
	}

}
