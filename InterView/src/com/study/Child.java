package com.study;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Child extends Parent {
	public String s="child";
	public static void test() {

		System.out.println("childddddddd");
	}

	
	public void sample()  {
		System.out.println("child sample");
	}
	public static void main(String args[]){
		//Queue p = new LinkedList<>();
		Parent p = new Parent();
		Child c = new Child();
		Parent pc = new Child();
		//pc=null;
		pc.test();
		//c = null;
		//c.sample();
		//p.test();
		//c.test();
		//pc.test();
		c.sample();
		//pc.sample();
		
		System.out.println("ttttt"+p.s);
		System.out.println("ttttt"+c.s);
		System.out.println("ttttt"+pc.s);
	
	}

}
