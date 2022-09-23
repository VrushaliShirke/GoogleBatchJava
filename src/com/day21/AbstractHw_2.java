package com.day21;

abstract class Abs{
	int x=5;
	abstract void show();
}

interface Itr{
	int y=45;
	void print();
}
class Add extends Abs implements Itr{
	void show() {
		System.out.println("x="+x);
	}
	public void print() {
		System.out.println("y="+y);
	}
	void disply(){
		System.out.println("Addition="+(x+y));
	}
}
public class AbstractHw_2 {

	public static void main(String[] args) {
		Add a= new Add();
		a.disply();

	}

}
