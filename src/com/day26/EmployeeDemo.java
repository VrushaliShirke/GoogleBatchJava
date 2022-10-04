package com.day26;

class Employee{
	int id;
	String name;
	int salary;
	public Employee(int id,String name,int salary) {
		this.id=id;
		this.name=name;
		this.salary=salary;
	}
	public String toString() {
		return id+" "+name+" "+salary;
	}
}
public class EmployeeDemo {

	public static void main(String[] args) {
		Employee emp[]= new Employee[3];
		emp[0]= new Employee(1,"Amit",67000);
		emp[1]= new Employee(2,"Neha",72000);
		emp[2]= new Employee(3,"Nukhil",78000);
		
		for(int i=0;i<emp.length;i++) {
			System.out.println(emp[i]);
		}
		System.out.println(".........................................");
		for(Employee e:emp) {
			System.out.println(e);
		}
	}

}
