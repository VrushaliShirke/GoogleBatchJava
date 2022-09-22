package com.day14;

public class Empy {
	int salary;
	
	public Empy getEmpy(Empy e1) {
		e1.salary=10000;
		//return e1;
		//return this;
		Empy x=new Empy();
		x=e1;
		return x;
		
	}

	public static void main(String[] args) {
		
		Empy emp=new Empy();
		Empy e= new Empy();
		int sum=0;
		
		Empy e2=emp.getEmpy(e);
		
		System.out.println(e);
		System.out.println(e.salary);
		System.out.println(e2.salary);
	}

}
