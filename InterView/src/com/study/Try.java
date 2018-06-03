package com.study;

public class Try {
 public  int value=0; 
	public int show(){
		try{
			int a = 10/0;
		}catch(Exception e){
			value=20;
			return value;
		}
		finally{
			value=30;
			return value;
		}
	}
	public static void main(String args[]){
		Try t = new Try();
		t.show();
		System.out.println(t.value);
	}
}
