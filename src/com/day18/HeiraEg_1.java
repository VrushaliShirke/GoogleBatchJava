package com.day18;
class Mobile1{
	String size;
	void show() {
		System.out.println("Mobile");
	}
}
class Samsung extends Mobile1{
	void show() {
		size="5 inches";
		System.out.println("Size: "+size);
	}
}
class Vivo extends Mobile1{
	void show() {
		size="6 inches";
		System.out.println("Size: "+size);
	}
}
public class HeiraEg_1 {

	public static void main(String[] args) {
		Mobile1 s= new Samsung();
		s.show();
		Mobile1 v= new Vivo();
		v.show();
		Mobile1 m= new Mobile1();
		m.show();

	}

}
