package com.day14;

public class Emp {
	int salary;
	
	public Emp(int salary) {
		this.salary=salary;
	}
	
	public int increment() {
		return (int)(salary+(salary*0.1));
	}
	
	public void display() {
		this.salary= this.increment();
		System.out.println(salary);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Emp e= new Emp(56000);
		e.display();
	}

}
