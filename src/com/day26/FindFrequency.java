package com.day26;

public class FindFrequency {
	public static int[] findFreq(int a[]) {
		
		for(int i=0;i<a.length;i++) {
			int count=1;
		boolean isVisited=false;
		for(int k=i-1;k>=0;k--) {
			if(a[i]==a[k]) {
				isVisited=true;
				break;
			}
		}
		if(isVisited==false) {
			for(int j=i+1;j<a.length;j++) {
				if(a[i]==a[j]) {
				count++;
				}
			}
			System.out.println(a[i]+" "+count);
		}
		
		}
		return a;
	}

	public static void main(String[] args) {
		
		int a[]= {3,6,3,6,1,6};
		FindFrequency.findFreq(a);
		
	}

}
