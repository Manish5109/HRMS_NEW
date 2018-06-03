package com.study.test.excepiton;

public class Test {
	public static void main(String[] args) {

		MyException ex = new MyException("throwing excepiton.");
		throw ex;

	}
}
