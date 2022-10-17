package com.day34;

import java.util.*;

public class FreqWord {

	public static int freqWord(String str) {
		String s[] = str.split("\\s");
		int count = 0;
		for (int i = 0; i < s.length; i++) {
			count=1;
			boolean isVisited = false;
			for (int k = i - 1; k >= 0; k--) {
				if (s[i].equals(s[k])) {
					isVisited = true;
					break;
				}
			}
			if (isVisited == false) {
				for (int j = i + 1; j < s.length; j++) {
					if (s[i].equals(s[j])) {
						count++;
						
					}
				}
			}
			
			if (isVisited == false) {
				System.out.println(s[i] + " =" + count + " times");
			}
		}
		return count;
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		FreqWord.freqWord(s);
		
	}

}
