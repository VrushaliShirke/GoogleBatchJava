package com.day18;
class Plastic{
	String type;
}
class Clay{
	String type;
}
class Cup extends Plastic extends Clay{
	void show() {
	type= "Mug";
	System.out.println(type);
	}
}
public class MultipleEg_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
