package com.day17;
class Department1{
	int did;
	String city;
	public Department1(int did,String city) {
		this.did=did;
		this.city=city;
	}
	public String toString() {
		return did+" "+city;
	}
}
public class EmployeeC {

	int id;
	String name;
	int salary;
	Department1 dept;
	public EmployeeC(int id,String name,int salary,Department1 dept) {
		this.id=id;
		this.name=name;
		this.salary=salary;
		this.dept=dept;
	}
	public String toString() {
		return id+" "+name+" "+salary+" "+dept;
	}
	public static void main(String[] args) {
		EmployeeC e= new EmployeeC(577,"Meera",50000,new Department1(90,"Mumbai"));
		System.out.println(e);
	}

}
