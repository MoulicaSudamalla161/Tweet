package com.tweetapp.util;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateUtil {
	public static Date convertToDate(String date) {
		Date parsedDate = null;
		try {
			SimpleDateFormat dateFormate = new SimpleDateFormat("dd/MM/yyyy");
			dateFormate.setLenient(false);
			parsedDate = dateFormate.parse(date);
		} catch (ParseException parseException) {
			parseException.printStackTrace();
		}
		return parsedDate;
	}

}
