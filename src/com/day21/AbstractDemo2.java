package com.day21;

abstract class Vehical1{
	abstract void run();
}
abstract class Car1 extends Vehical1{
	abstract void stop();
}
class BMW extends Car1{
	public void run() {
		System.out.println("BMW running....");
	}
	public void stop() {
		System.out.println("BMW stop....");
	}
}
public class AbstractDemo2 {

	public static void main(String[] args) {
		BMW b= new BMW();
		b.run();
		b.stop();

	}

}