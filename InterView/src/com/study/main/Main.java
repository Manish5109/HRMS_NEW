package com.study.main;

import java.util.Date;

import com.study.immutable.DateAndMap;

public class Main {
	public static void main(String args[]){
		Date dt= new Date();
		DateAndMap dm = new DateAndMap("abc", dt);
		Date dt1 = dm.getDate();
		dt1.setYear(100);
		System.out.println(dt);
		System.out.println(dt1);
	}

}
