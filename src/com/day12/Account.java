package com.day12;
import java.util.Scanner;
public class Account {
	int acc_id;
	String acc_type;
	int balance;
	//int deposite;
	
	//int withDraw;
	//int currentBalance;
	void acceptDetails(int aid,String atype,int abalance) {
		acc_id=aid;
		acc_type= atype;
		balance=abalance;
	}
	void display() {
		System.out.println(acc_id+" "+acc_type+" "+balance);
	}
	
	/*
	 * public int currentBalance(int cbalance,int adeposit,int withDrow) { int
	 * currentBal=0; currentBal=balance-withDrow; return currentBal; }
	 */
	public void withdraw(int amount)
	{
		balance=balance-amount;
		checkBalance();
	}
	public void deposite(int amount)
	{
	balance=balance+amount;
	checkBalance();
	}
	
	
	void checkBalance() {
		System.out.println("Balance="+balance);
	}
	
	public static void main(String[] args) {
		Account ac= new Account();
		Scanner sc= new Scanner(System.in);
		ac.acceptDetails(4032,"Neha", 50000);
		ac.display();
		System.out.println("enter the amount for withdraw");
		int d= sc.nextInt();
		ac.withdraw(d);
		System.out.println("enter the amount for deposite");
		int w= sc.nextInt();
		ac.deposite(w);
		
	}
}
