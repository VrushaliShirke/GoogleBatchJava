package com.day22;

interface Drinkable{
	void tea();
}
abstract class Shop implements Drinkable{
	
}
class TeaShop extends Shop{
	public void tea() {
		System.out.println("Person like tea to drink....");
	}
}
public class InterfaceDemo4 {

	public static void main(String[] args) {
		TeaShop t= new TeaShop();
		t.tea();
	}

}
