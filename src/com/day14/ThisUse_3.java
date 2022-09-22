package com.day14;

class Order{
	int oid;
	String city;
	int cust_id;
	int status;
	
	Order(int oid,String city,int cust_id,int status){
		this.oid=oid;
		this.city=city;
		this.cust_id=cust_id;
		this.status=status;
	}
	
	Order(){
		this(1,"pune",2234,1);
		if(status==0) {
			System.out.println("Your order is out for delivery");
		}
		else {
			System.out.println("Order is deliveres");
			show_OrderDetails();
		}
	}
	
	 void show_OrderDetails() {
			System.out.println(oid+" "+city+" "+cust_id+" "+status);
		}
}

public class ThisUse_3 {

	public static void main(String[] args) {
		Order d=new Order();

	}

}
