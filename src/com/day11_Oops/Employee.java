package com.day11_Oops;

public class Employee {
	int eid;
	String name;
	double salary;
	public static void main(String[] args) {
		Employee nikhil=new Employee();
		nikhil.eid=23;
		nikhil.name="Nikhil";
		nikhil.salary=34543;
		System.out.println(nikhil.eid+" "+nikhil.name+" "+nikhil.salary);
		
		Employee emp=new Employee();
		emp.eid=45;
		emp.name="Neha";
		emp.salary=64233;
		System.out.println(emp.eid+" "+emp.name+" "+emp.salary);
		
	}

}
