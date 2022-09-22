package com.day18;
class Climate{
	String type= "Cold";
}
class Weather extends Climate{
	void show() {
		System.out.println("Type: "+type);
	}
}
public class SingleEg {

	public static void main(String[] args) {
		Weather w= new Weather();
		w.show();

	}

}
