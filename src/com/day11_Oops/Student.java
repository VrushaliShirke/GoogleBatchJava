package com.day11_Oops;

public class Student {
	int sid;
	String name;
	int Marathi;
	int Hindi;
	int English;
	float per;
	void acceptDetails(int s,String sname) {
		sid= s;
		name=sname;
	}
	void calPercentage(int mname,int hname,int ename) {
		per=(mname+hname+ename)*100/300f;
	}
	void display() {
		System.out.println(sid+" "+name+" "+per+" ");
	}
	
	public static void main(String[] args) {
		Student std= new Student();
		std.acceptDetails(45, "Neha");
		std.calPercentage(89, 78, 88);
		std.display();
	}

}
