package com.day21;
abstract class Mobile{
	abstract void ringing();
	
	public void sendSms() {
		System.out.println("Mobile id use for sending sms");
	}
}
class Apple extends Mobile{
	@Override
	void ringing() {
		System.out.println("Apple is ringing...");
	}
}
public class AbstractDemo1 {

	public static void main(String[] args) {
//		Apple a= new Apple();
//		a.ringing();
		
		Mobile m= new Apple();
		m.ringing();
		m.sendSms();

	}

}
