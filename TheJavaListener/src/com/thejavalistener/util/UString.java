package com.thejavalistener.util;

public class UString
{
	// retorna una cadena compuesta por n caracteres c.
	public static String replicate(char c, int n)
	{
		String aux="";
		for(int i=0; i<n; i++)
		{
			aux+=c;
		}

		return aux;
	}

	// retorna una cadena de longitud n compuesta por s 
	// precedida por caracteres c
	public static String lpad(String s, char c, int n)
	{
		return replicate(c,n-s.length())+s;
	}
	
	public static String padInt(long v, int n)
	{
		String s = Long.toString(v);
		return lpad(s,' ',n);
	}
	
	public static boolean isInteger(String s)
	{
		try
		{
			// si no da problemas...
			Long.parseLong(s);
			return true;
		}
		catch(Exception ex)
		{
			// si dio problemas entonces no era int ni long...
			return false;
		}
	}
}
