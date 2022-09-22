package com.day18;
class Refrigerator{
	String brandName;
	
}
class LG1 extends Refrigerator{
	String type;
}
class Size extends LG1{
	String size="Standard";
	void show() {
		brandName= "LG";
		type="Single_Door";
		System.out.println(brandName+" "+type+" "+size);
	}
}
public class MultilevelEg_2 {

	public static void main(String[] args) {
		Size s= new Size();
		s.show();

	}

}
