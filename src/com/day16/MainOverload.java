package com.day16;

public class MainOverload {

	public static void main() {
		System.out.println("Good Morning...");
	}
	
	public static void main(String s) {
		System.out.println("Welcome...");
	}
	public static void main(String[] args) {
		
		MainOverload.main();
		MainOverload.main("Welcome");
	}

}
