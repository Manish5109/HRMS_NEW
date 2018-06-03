package com.study.clone;

public class MyReflection {

	public static void main(String args[]) {
		try {

			int i = Integer.valueOf("a", 16);
			long a = 1l;
			int b =(int) a;
			System.out.println(b);
			Class mr = Class.forName("com.study.clone.MyClone");
			System.out.println(mr.getName());
		} catch (Exception e) {
			System.out.println("exception caught" + e);
		}

	}
}
