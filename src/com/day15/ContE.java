package com.day15;

public class ContE {
	int id;
	String name;
	int m1,m2,m3;
	ContE(int id,String name){
		this.id=id;
		this.name=name;
	}
	
	ContE(int id, String name,int m1,int m2,int m3){
		this(id,name);
		this.m1=m1;
		this.m2=m2;
		this.m3=m3;
		
	}
	public static void main(String[] args) {
		ContE c= new ContE(1,"a",45,67,34);
	}

}
