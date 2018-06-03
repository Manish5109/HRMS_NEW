package com.study.immutable;

import java.util.Date;

public final class DateAndMap {
	
	private final String str;
	private final Date dt;
	
	public DateAndMap(String str, Date dt){
		this.str=str;
		this.dt = new Date(dt.getTime());
	}

	public Date getDate(){
		return new Date(dt.getTime());
	}
	public String getStr(){
		return str;
	}
}
