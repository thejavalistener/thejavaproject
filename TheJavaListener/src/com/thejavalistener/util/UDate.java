package com.thejavalistener.util;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class UDate
{
	public static String longToString(long f)
	{
		GregorianCalendar g=new GregorianCalendar();
		g.setTimeInMillis(f);
		String y=UString.lpad(Integer.toString(g.get(Calendar.YEAR)),'0',4);
		String m=UString.lpad(Integer.toString(g.get(Calendar.MONTH)+1),'0',2);
		String d=UString.lpad(Integer.toString(g.get(Calendar.DAY_OF_MONTH)),'0',2);

		return y+"/"+m+"/"+d;
	}

	public static long stringToLong(String f)
	{
		int p1=f.indexOf("/");
		int p2=f.lastIndexOf("/");

		int y=Integer.parseInt(f.substring(0,p1));
		int m=Integer.parseInt(f.substring(p1+1,p2));
		int d=Integer.parseInt(f.substring(p2+1));

		GregorianCalendar g=new GregorianCalendar(y,m-1,d);

		return g.getTimeInMillis();
	}

	public static String addDays(String f, int n)
	{
		GregorianCalendar g=new GregorianCalendar();
		g.setTimeInMillis(stringToLong(f));
		g.add(Calendar.DAY_OF_MONTH,n);
		return longToString(g.getTimeInMillis());
	}

	public static String now()
	{
		return longToString(System.currentTimeMillis());
	}
}