package com.day15;
import java.util.Scanner;
public class Extra {

	public static void main(String[] args) {
		Scanner kb= new Scanner(System.in);
		System.out.println("Enter the number:");
		long num=kb.nextLong();
		long temp=num;
		long f=0;
		for(long i=num;i>0;i=i/10) {
			long r1=i%10;
			f=0;
			
			boolean flg=false;
			for(long k=i/10;k>0;k=k/10) {
				long r=k%10;
				if(r==r1) {
					flg=true;
					break;
				}
			}
			if(flg==false) {
				for(long j=temp;j>0;j=j/10) {
					long r2=j%10;
					if(r1==r2) {
						f++;
					}
				}
				if(f>0) {
					System.out.println(r1+" =frequency is "+f);
				}
			}
		}

	}

}
