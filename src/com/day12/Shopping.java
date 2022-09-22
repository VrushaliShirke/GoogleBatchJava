package com.day12;

public class Shopping {
	int parItems;
	int quantity;
	int price;
	int bill;
	void acceptDetails(int par,int quan,int p) {
		parItems=par;
		quantity=quan;
		price=p;
	}
	void tbill(int b) {
		bill=quantity*parItems*price;
	}
	
	public int totalBill(int tbill) {
		if (parItems==0) {
			System.out.println(bill);
		}
		else {
			System.out.println("Please purchase somthing");
		}
		return bill;
	}
	void display() {
		System.out.println(parItems+" "+quantity+" "+price+" "+bill);
	}
	public static void main(String[] args) {
		Shopping sh= new Shopping();
		sh.acceptDetails(5, 2, 50);
		
		sh.tbill(0);
		sh.display();
	}
}
