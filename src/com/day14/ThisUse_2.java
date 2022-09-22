package com.day14;

class Customer{
	int id;
	String name;
	String address;
	int item_price;
	int qnt;
	int total_bill;
	
	public Customer(int id,String name,String address,int item_price,int qnt) {
		this.id=id;
		this.name=name;
		this.address=address;
		this.item_price=item_price;
		this.qnt=qnt;
		
	}
	public void calculate_Bill() {
		total_bill=qnt*item_price;
	}
	void display() {
		if(qnt>0) {
			this.calculate_Bill();
			System.out.println(id+" "+name+" "+address+" "+item_price+" "+qnt+" "+total_bill);
		}
		else {
			System.out.println("Quantity must be greater than zero");
		}
	}
}	
public class ThisUse_2{
	

	public static void main(String[] args) {
		Customer cust= new Customer(1,"Amit","Pune",400,6);
		cust.calculate_Bill();
		cust.display();
	}


}
