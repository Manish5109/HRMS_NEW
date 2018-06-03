package com.study;

import java.io.IOException;
import java.sql.SQLException;

public class MyException {
	
	public static void test() throws Exception{
		try{
			throw new Exception();
		}catch(IOException e){
			System.out.println("catch blockaaaaaaaaaaaaa");
		}
		finally{
			System.out.println("Finally Block");
		}
	}

	public static void main(String args[]){
		try{
			test();
		}catch(Exception e){
			System.out.println("catch block");
		}
	}
}
