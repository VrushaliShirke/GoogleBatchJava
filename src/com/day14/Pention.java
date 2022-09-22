package com.day14;

class Pentioner{
	int pid;
	String name;
	int age;
	int pention;
	int last_salary;
	int calculate_pent;
	
	public Pentioner(int pid,String name,int age,int last_salary) {
		this.pid=pid;
		this.name=name;
		this.age=age;
		this.last_salary=last_salary;
		show_accDetails();
		calculate_pent();
	}
	public Pentioner() {
//		this.(12,"mohan",67,50000);
		warning();
	}
	public void warning() {
		if(age==85) {
			System.out.println("Please update your account");
		}
	}
	public Pentioner(int age) {
		this();
		age(age);
		
	}
	public void age(int age) {
		if(age>85&&age<90) {
			pention= calculate_pent+((calculate_pent*30)/100);
			System.out.println("pention="+pention);
		}
		else if(age>90&&age<95){
			pention= calculate_pent+((calculate_pent*40)/100);
			System.out.println("pention="+pention);
		}
		else if(age>95){
			pention= calculate_pent+((calculate_pent*50)/100);
			System.out.println("pention="+pention);
		}
		else if(age>60&&age<85) {
			System.out.println("pention="+calculate_pent);
		}
	
		else {
		System.out.println("You are not eligible for pention");
		}
	}
	public void calculate_pent() {
		calculate_pent= (last_salary/2);
		System.out.println("Your pention is= "+calculate_pent);
	}
	
	void show_accDetails() {
		System.out.println(pid+" "+name+" "+age+" "+last_salary);
	}
	
}
	public class Pention {

	public static void main(String[] args) {
		Pentioner pn=new Pentioner(12,"mohan",95,50000);
		

	}

}
