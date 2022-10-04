package com.day27;
import java.util.*;

public class StudentInfo {

	int id;
	String name;
	int[] marks;
	StudentInfo(int id,String name, int[]marks){
		this.id=id;
		this.name=name;
		this.marks=marks;
	}
	public String toString() {
		return id+" "+name+" "+Arrays.toString(marks);
	}
	public static void main(String[] args) {
		StudentInfo st[]= new StudentInfo[3];
		Scanner sc= new Scanner(System.in);
		for(int i=0;i<st.length;i++) {
			System.out.println("Enter the id: ");
			int sid=sc.nextInt();
			System.out.println("Enter the name: ");
			String name=sc.next();
			
			int mk[]= new int[3];
			for(int j=0;j<mk.length;j++) {
				System.out.println("Enter the marks: ");
				mk[j]=sc.nextInt();
			}
			st[i]=new StudentInfo(sid,name,mk);
		}
		System.out.println("....................................");
		
		for(int i=0;i<st.length;i++) {
			System.out.println(st[i]);
		}
		System.out.println(".........................................");
		for(int i=0; i<st.length;i++) {
			int m[]= st[i].marks;
			int sum=0;
			for(int j=0;j<m.length;j++) {
				sum=sum+m[j];
			}
			int per= sum/m.length;
			if(per>60) {
				System.out.println(st[i]+"  per="+per);
			}
		}
	}

}
