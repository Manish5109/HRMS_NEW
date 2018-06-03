package com.study;

public class MyString {

	public static void main(String args[]) {
		String s = new String("abc");
		String s1 = new String("abc");
		String s3="this";
		String s4="this";
		if (s == s1) {
			System.out.println("first if");
		} else {
			System.out.println("first else");
			String s2 = s1;

			if (s2 == s1) {
				System.out.println("second if");
			}
			if(s2.equals(s1)){
				System.out.println("first else if");
			}
			if(s3==s4){
				System.out.println("hello");
			
			}
			if(s3.equals(s4)){
				System.out.println("hello toooo");
			}
		}
	}
	

	

}
