package com.day18;
class WashingMachine{
	String brandName;
	void show() {
		System.out.println("Type...");
	}
}
class LG extends WashingMachine{
	String type;
}
class Automatic extends LG{
	String weight="6Kg";
	void show() {
		brandName="LG";
		type="Automatic";
		System.out.println(brandName+" "+type+" "+weight);
	}
}
public class MultilevelEg_1 {

	public static void main(String[] args) {
		Automatic a= new Automatic();
		a.show();

	}

}
