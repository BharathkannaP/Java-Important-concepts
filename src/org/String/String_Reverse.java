package org.String;

public class String_Reverse {

	public static void main(String[] args) {
		String s="Java Selenium";
		
		// 1. Using for loop
		
		int len=s.length();
		String rev=" ";
		
		for(int i=len-1;i>=0;i--) {
			
		rev=rev+s.charAt(i);
		}
		System.out.println(rev);
	

	//2. using StringBuffer
	StringBuffer sb=new StringBuffer(s);
	System.out.println(sb.reverse());
}
}