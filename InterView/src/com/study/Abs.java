package com.study;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Abs {

	Integer id = 10;

	public void show(Integer in) {
		System.out.println("integer calling" + in);
	}

	public void show(int i) {
		System.out.println("int method call" + i);
	}

	public void show1(Object o) {
		System.out.println("object () callingggggg");
	}

	public void show1(String s) {
		System.out.println("Stinrg () calling");
	}

	@Override
	public int hashCode() {
		return this.id.hashCode();
	}

	public boolean equals(Abs as) {
		if (this == as) {
			return true;
		}
		return false;
	}

	public static void main(String args[]) {
		Abs ab = new Abs();
		// ab.hashCode();
		// int a=10;
		// Integer ss =a;
		// ab.show(4000);
		// ab.show(6);
		// ab.show(ss);

		Date date = new Date();
		System.out.println(date);
		System.out.println(new SimpleDateFormat("dd-MM-yyyy:hh.mm.ss SSSS a").format(date));

		ab.show1(null);
		System.out.println(null == null);
	}
}
