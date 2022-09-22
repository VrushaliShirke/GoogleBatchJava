package com.day18;

class Mobile{
	String brandName;
	
}
class Apple extends Mobile{
	String RAM;
}
class IphonePro extends Apple{
	String camera="32px";
	void show() {
		brandName="x";
		RAM="128 GB";
		System.out.println(brandName+" "+RAM+" "+camera);		
	}
}
public class MultilevelDemo {

	public static void main(String[] args) {
		IphonePro i=new IphonePro();
		i.show();

	}

}
