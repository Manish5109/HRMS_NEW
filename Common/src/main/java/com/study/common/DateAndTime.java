package com.study.common;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateAndTime {

	String dateFormate;
	String dateTimeFormate;

	String iDateFormate;
	String iDateTimeFormate;
	String s;
	String oDateFormate;
	String oDateTimeFormate;
	String dValue;
	String dtValue;
	SimpleDateFormat sdf;
	Date date;

	public String getDateFormate() {
		return dateFormate;
	}

	public void setDateFormate(String inputDateFormate, String outputDateFormat, String dateValue) {
		try {
			iDateFormate = inputDateFormate;
			oDateFormate = outputDateFormat;
			dValue = dateValue;
			sdf = new SimpleDateFormat(iDateFormate);
			date = sdf.parse(dValue);
			sdf.applyPattern(outputDateFormat);
			dateFormate = sdf.format(date);
		} catch (Exception e) {
			System.out.println("throw date exception");
		}

	}

	public String getDateTimeFormate() {
		return dateTimeFormate;
	}

	public void setDateTimeFormate(String inputDateFormate, String outputDateFormat, String dateValue) {
		try {
			iDateTimeFormate = inputDateFormate;
			oDateTimeFormate = outputDateFormat;
			dtValue = dateValue;
			sdf = new SimpleDateFormat(iDateTimeFormate);
			date = sdf.parse(dValue);
			sdf.applyPattern(outputDateFormat);
			dateTimeFormate = sdf.format(date);
		} catch (Exception e) {
			System.out.println("throw datetime exception");
		}

	}

}
