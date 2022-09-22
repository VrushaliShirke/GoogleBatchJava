package com.day11_Oops;

public class Cube {

	int c=5;
	public void WRWP() {
		int result= c*c*c;
		System.out.println(result);
	}
	public int RWP() {
		int result= c*c*c;
		System.out.println(result);
		return result;
	}
	public void WRP(int c) {
		int result= c*c*c;
		System.out.println(result);
		
	}
	public int RP(int c) {
		int result= c*c*c;
		System.out.println(result);
		return result;
	}
	public static void main(String[] args) {
		Cube a= new Cube();
		a.WRWP();
		a.RWP();
		a.WRP(3);
		a.RP(4);

	}

}
