package com.day27;

import java.util.Arrays;

class Emp{
	int eid;
	String ename;
	Emp(int eid,String ename){
		this.eid=eid;
		this.ename=ename;
	}
	public String toString() {
		return eid+" "+ename;
	}
}
public class Department {
	int id;
	String name;
	Emp e;
	Department(int id,String name,Emp e){
		this.id=id;
		this.name=name;
		this.e=e;
	}	
	public String toString() {
		return id+" "+name+" "+e;
	}
	public static void main(String[] args) {
		Department d[]= new Department[3];
		d[0]= new Department(1,"Hr",new Emp(101,"Neha"));
		d[1]= new Department(2,"Sales",new Emp(102,"Yash"));
		d[2]= new Department(3,"Admin", new Emp(103,"Chavi"));
		
		for(int i=0;i<d.length;i++) {
			System.out.println(d[i]);
		}
		
	}

}
