package com.day12;
import com.day12.*;
public class G_SDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Getter_Setter emp= new Getter_Setter();
		emp.setId(101);
		emp.setName("Neha");
		emp.setSalary(670000);
		
		System.out.println(emp.getId());
		System.out.println(emp.getName());
		System.out.println(emp.getSalary());
		System.out.println(emp.getId()+"\n"+emp.getName()+"\n"+emp.getSalary());
		
	}

	

}
