/**
 * Designed By : Varun
 * Class Name : Date And Time Util
 * Usage : To get the output in desired date format
 */
package com.evonsys.citi.util.dateAndTime;

import java.text.SimpleDateFormat;
import java.util.Calendar;

public class DateAndTimeUtil {
	public String getTomorrowDate() {
		Calendar cal = Calendar.getInstance();
		cal.add(Calendar.DATE, 1);
		SimpleDateFormat format = new SimpleDateFormat("MM/dd/yyyy");
		String newDate = format.format(cal.getTime());
		return newDate;
	}
}
