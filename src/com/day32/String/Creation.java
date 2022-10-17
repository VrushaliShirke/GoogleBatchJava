package com.day32.String;

public class Creation {

	public static void main(String[] args) {
		
		String str="Pune"; //using literal/SCP
		String st= new String("Pune"); //using new//heap
		String s="Pune";
		//String s="Hello";
		String st2=new String("Pune");
		
		System.out.println(s==str);
		
		System.out.println(s.hashCode()+" "+str.hashCode());
		System.out.println(s==st2);
		System.out.println(s.hashCode()+" "+st2.hashCode());

//		System.out.println(str.hashCode()+" "+st2.hashCode());
		
		//Why we use equal() method instead of '==' .
		String s1="Aa";
		String s2="BB";
		System.out.println(s1.hashCode()==s2.hashCode());
	}

}
