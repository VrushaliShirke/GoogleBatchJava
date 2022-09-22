package com.day18;
class Mouse{
//	String type="Laser";
//	void show() {
//		System.out.println("Type="+type);
//	}
	
	Mouse(String type){
		System.out.println("Type="+type);
	}
}
class Dell10 extends Mouse{
//	void show() {
//		System.out.println("Dell");
//		super.show();
//	}
	
//	Dell10(){
//		super("Laser");
//		System.out.println();
//	}
	
	Dell10(String s){
		super(s);
		System.out.println();
	}
}
public class SuperEg {

	public static void main(String[] args) {
//		Dell10 d= new Dell10();
//		d.show();
		Dell10 a= new Dell10("Laser");
	}

}
