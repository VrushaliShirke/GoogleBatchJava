package com.day27;
import java.util.*;
public class Employee {

	int id;
	String name;
	static int[] salary;
	Employee(int id,String name,int[] salary){
		this.id=id;
		this.name=name;
		this.salary=salary;
	}
	public String toString() {
		return id+" "+name+" "+Arrays.toString(salary);
	}
	public static void main(String[] args) {
		Employee emp[]=new Employee[3];
		Scanner sc= new Scanner(System.in);
		for(int j=0;j<emp.length;j++) {
		System.out.println("Enter the id:");
		int eid= sc.nextInt();
		System.out.println("Enter the name");
		String ename= sc.next();
		
		int salary[]=new int[1];
		for(int i=0;i<salary.length;i++) {
			System.out.println("enter the salary");
			salary[i]=sc.nextInt();
		}
		emp[j]=new Employee(eid,ename,salary);
		}
		System.out.println("..................................");
		for(int i=0;i<emp.length;i++) {
			System.out.println(emp[i]);
		}
		System.out.println("....................................");
		for(int i=0;i<emp.length;i++) {
			int s[]=emp[i].salary;
			int sl= salary[i];
			if(sl<15000) {
				System.out.println(emp[i]+"  salary="+sl);
			}
		}
//		Employee emp[]=new Employee[3];
//		emp[0]=new Employee(1,"Neha",50000);
//		emp[1]=new Employee(2,"Harish",14000);
//		emp[2]=new Employee(3,"Girija",10000);
//		
//		for(int i=0;i<emp.length;i++) {
//			System.out.println(emp[i]);
//		}
//		int salary[]= new int[]
//		for(int i=0;)
//		if(salary<15000) {
//			
//		}

	}

}
