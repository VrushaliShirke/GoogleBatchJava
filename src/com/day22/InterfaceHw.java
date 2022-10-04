package com.day22;

interface Downloadable{
	int n=45;
//	int sum=0;
	abstract int show(int n) ;
}
class Internet implements Downloadable{
	public int show(int n) {
		return n;
	}
	void factors() {
		
	for(int i=1;i<=n;i++) {
		int sum=0;
		if(n%i==0) {
		sum=sum+i;
		}
		System.out.println(sum);
	}
	}
}
public class InterfaceHw {

	public static void main(String[] args) {
		
		Internet i= new Internet();
		i.factors();

	}

}
