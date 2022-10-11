package com.day27;
import java.util.*;
public class Employee {

	int id;
	String name;
	 double salary;
	Employee(int id,String name,double salary){
		this.id=id;
		this.name=name;
		this.salary=salary;
	}
	public String toString() {
		return id+" "+name+" "+salary;
	}
	public static void main(String[] args) {
		Employee emp[]=new Employee[3];
		
		emp[0]= new Employee(1,"Neha",20000);
		emp[1]= new Employee(2,"Girija",10000);
		emp[2]= new Employee(3,"Mihir",12000);
		
		for(int i=0;i<emp.length;i++) {
			if(emp[i].salary<1500) {
				emp[i].salary=emp[i].salary+ ((emp[i].salary*1.1)/100);
			}
		}
		for(int i=0;i<emp.length;i++) {
			System.out.println(emp[i]);
		}
		
		
		}

	
	
}
