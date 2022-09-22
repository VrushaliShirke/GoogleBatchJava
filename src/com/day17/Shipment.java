package com.day17;

class Order{
	int oid;
	int cust_id;
	String city;
	
	Order(int oid,int cust_id,String city){
		this.oid=oid;
		this.cust_id=cust_id;
		this.city=city;
	}
	public String toString() {
		return oid+" "+cust_id+" "+city;
	}
}

class MyDate{
	int dd,mm,yy;
	MyDate(int dd,int mm,int yy){
		this.dd=dd;
		this.mm=mm;
		this.yy=yy;
	}
	public String toString() {
		return dd+" "+mm+" "+yy;
	}
}
public class Shipment {
	int sid;
	Order o;
	MyDate d;
	
	Shipment(int sid,Order o,MyDate d){
		this.sid=sid;
		this.o=o;
		this.d=d;
	}
	public String toString() {
		return sid+" "+o+" "+d;
	}

	public static void main(String[] args) {
		Shipment s= new Shipment(45,new Order(768,3523312,"Pune"),new MyDate(23,4,22));
		System.out.println(s);
	}

}
