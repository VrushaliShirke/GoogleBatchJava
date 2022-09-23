package com.day21;

abstract class Mobile1{
	int x;
	abstract void ringing();
	
	Mobile1(String str){
		System.out.println("Mobile="+str);
	}
}
class Apple1 extends Mobile1{
	Apple1(){
		super("vivo");
	}
	@Override 
	void ringing() {
		System.out.println("Apple is ringing");
	}
}
public class AbstractDemoConstructor {

	public static void main(String[] args) {
		Mobile1 m= new Apple1();
		m.ringing();

	}

}
