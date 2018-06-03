package com.study.test.excepiton;

public class MyException extends RuntimeException {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public MyException(String msg) {
		super(msg);
	}

	public MyException(String msg, Throwable ex) {
		super(msg, ex);
	}

}
