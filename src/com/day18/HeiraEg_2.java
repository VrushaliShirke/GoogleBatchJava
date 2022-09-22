package com.day18;
class Water_Geyser{
	String type;
	void show() {
		System.out.println("Type");
	}
}
class Electric_Geyser extends Water_Geyser{
	void show() {
	type="Electric";
	System.out.println("Type: "+type);
	}
}
class Gas_Geyser extends Water_Geyser{
	void show() {
		type="Gas";
		System.out.println("Type: "+type);
	}
}
public class HeiraEg_2 {

	public static void main(String[] args) {
		Water_Geyser e= new Electric_Geyser();
		e.show();
		Water_Geyser g= new Gas_Geyser();
		g.show();
		Water_Geyser w= new Water_Geyser();
		w.show();

	}

}
