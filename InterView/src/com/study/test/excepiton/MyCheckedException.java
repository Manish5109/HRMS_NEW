package com.study.test.excepiton;

public class MyCheckedException extends Exception {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public MyCheckedException(String msg) {
		super(msg);
	}

	public MyCheckedException(String msg, Throwable ex) {
		super(msg, ex);
	}

}
