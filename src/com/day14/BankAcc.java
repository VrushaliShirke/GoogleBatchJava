package com.day14;

class AC{
	
	int ano;
	String name;
	int balance;
	String bname;
	String branch="Pune";
	double current_bal;
	
	public AC(int ano,String name,int balance,String bname,String branch) {
		this();
		this.ano=ano;
		this.name=name;
		this.balance=balance;
		this.bname=bname;
		this.branch=branch;
		show_accountDetails();
	}
	public AC() {
		branch();
	}
	public void branch() {
		if() {
			System.out.println("Your account details are:");
		}
		else {
			System.out.println("Your account not in Pune branch");
		}
	}
	public void current_bal() {
		current_bal= balance+ ((balance*2.3)/100);
		
		System.out.println("Current balance="+current_bal);
	}
	
	void show_accountDetails() {
		System.out.println("Account ID: "+ano+"\nName: "+name+"\nBalance: "+balance+"\nBank Name: "+bname+"\nBranch: "+branch);
	}
	public void branch(String Pune) {
		
		
	}
}
public class BankAcc {
	

	public static void main(String[] args) {
		AC acc= new AC(12,"Mohan",50000,"ICICI","Mumbai");
		acc.current_bal();
		

	}

}
