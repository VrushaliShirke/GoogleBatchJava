package com.day32.String;

public class StringMethods {

	public static void main(String[] args) {
		
		String msg="Good Morning";
		System.out.println(msg);

		int len=msg.length();   //Returns the length of a specified string====>int
		System.out.println("Length of msg= "+ len);
		
		String lowerCase=msg.toLowerCase();   //Converts a string to lower case letters ====>String
		System.out.println("Lowercase= "+lowerCase);
		
		String upperCase= msg.toUpperCase();  //Converts a string to upper case letters ====>String
		System.out.println("Uppercase= "+ upperCase);
		
		String nonTrimmed= "         Good Morning         ";
		System.out.println(nonTrimmed);
		System.out.println(nonTrimmed.trim());  //Space around the String get trimmed
		
		System.out.println(msg.substring(5));   //Returns a new string which is the substring of a specified string====>String
		
		System.out.println(msg.substring(0,5)); //Return a new string from 0th index to nth index(0 to 5)
		
		System.out.println(msg.replace('o', 'e')); //Searches a string for a specified value, and returns a new string where the specified values are replaced===>String
		
		System.out.println(msg.startsWith("Bad"));  //Checks whether a string starts with specified characters===> Boolean
		
		System.out.println(msg.endsWith("ing"));   //Checks whether a string ends with the specified character(s)===>Boolean
		
		System.out.println(msg.charAt(6)); //  Returns the character at the specified index (position)====>Char
		
		System.out.println(msg.indexOf("oo"));  //Returns the position of the first found occurrence of specified characters in a string===>int
		
		System.out.println(msg.concat("!!!!"));  //Appends a string to the end of another string===>String
		
		System.out.println(msg.contains("rn")); //	Checks whether a string contains a sequence of characters===>Boolean
		
		String msg2[]=msg.split("\\r");
		for(String x:msg2) {
		System.out.println(x);  //Splits a string into an array of substrings
		
		}
	}

}
