package com.day14;
public class Employee {
	int id;
	String name;
	int salary;
	
	public void details(int i,String n,int s) {
		id=i;
		name=n;
		salary=s;
	}
	void disply() {
		System.out.println("Employee ID: "+id+"\nName: "+name+"\nsalary: "+salary);
	}
	public static void main(String[] args) {
		Employee emp=new Employee();
		emp.details(3, "Rajesh", 73264);
		emp.disply();
		System.out.println();
		
		Employee emp1=new Employee();
		emp1.details(5, "Neha", 74264);
		emp1.disply();
		System.out.println();
		
		Employee emp2=new Employee();
		emp2.details(7, "Isha", 63264);
		emp2.disply();
		System.out.println();
	}

}
