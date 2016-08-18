package com.ecbusiness.utils;

import org.apache.commons.codec.digest.DigestUtils;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public final class StringFormatUtil {

	private StringFormatUtil() {

	}

	public static String getEncodeStr(String orgStr) {

		return (new sun.misc.BASE64Encoder()).encode(DigestUtils.md5Hex(orgStr)
				.getBytes());
	}

	public static Date thisMonthFirstDate(Date date) throws ParseException {
		Calendar calendar = Calendar.getInstance();
		calendar.set(Calendar.DAY_OF_MONTH,
				calendar.getActualMinimum(Calendar.DAY_OF_MONTH));
		DateFormat format = new SimpleDateFormat("yyyy-MM-dd");
		return new Date(format.parse(format.format(calendar.getTime()))
				.getTime());
	}

	public static int thisMonthFirstDateForInt(Date date) throws ParseException {
		Calendar calendar = Calendar.getInstance();
		calendar.set(Calendar.DAY_OF_MONTH,
				calendar.getActualMinimum(Calendar.DAY_OF_MONTH));
		DateFormat format = new SimpleDateFormat("yyyyMMdd");
		return Integer.parseInt(format.format(calendar.getTime()));

	}

	public static int dateForInt(Date date) {
		DateFormat format = new SimpleDateFormat("yyyyMMdd");
		return Integer.parseInt(format.format(date));
	}

	public static String fileNameForThisTime() {
		DateFormat format = new SimpleDateFormat("yyyy_MM_dd_HH_mm_ss");
		return format.format(new Date());
	}
}
