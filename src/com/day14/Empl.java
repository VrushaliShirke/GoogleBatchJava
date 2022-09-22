package com.day14;

public class Empl {
	int salary=20000;
	
	public void getEmpl(Empl e1) {
		System.out.println(e1.salary);
	}
	
	public void input() {
		//Empl e= new Empl();
		//this.getEmpl(e);
		
		//this.getEmpl(new Empl());
		
		this.getEmpl(this);
		
	}

	public static void main(String[] args) {
		
		Empl emp =new Empl();
		emp.input();

	}

}
