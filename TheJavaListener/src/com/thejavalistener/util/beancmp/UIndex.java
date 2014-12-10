package com.thejavalistener.util.beancmp;

import java.util.Vector;

public class UIndex
{
	public static final int KEY=0;
	public static final int SIGN=1;	
	
	// retona una coleccion de pares (signo,clave)
	public static String[][] getKeys(String pkline)
	{
		Vector<String> keys = new Vector<String>();
		Vector<String> signs = new Vector<String>();
		StringBuffer buff = new StringBuffer();
		
		// tomo el primer caracter
		char z = pkline.charAt(0);
		
		// si la cadena no comienza con un signo entonces agrego un + al inicio
		if( z!='+' && z!='-' )
		{
			pkline="+"+pkline;
		}
		
		// recorro la cadena
		for(int i=0; i<pkline.length(); i++)
		{
			// tomo el i-esimo caracter
			char c = pkline.charAt(i);
			
			// si no es un signo...
			if( c!='+' && c!='-' )
			{
				// lo agrego a un buffer
				buff.append(c);
			}
			else // llego un signo... 
			{
				// si el buffer no esta vacio =>> contiene una key
				if( buff.length()>0 )
				{
					keys.add(buff.toString());
					buff.delete(0,buff.length());
				}
				signs.add(Character.toString(c));
			}
		}
		keys.add(buff.toString());
		
		String ret[][] = new String[keys.size()][2];
		for(int i=0; i<ret.length; i++)
		{
			ret[i][0] = keys.get(i);
			ret[i][1] = signs.get(i);
		}
		
		return ret;
	}
	
	public static void main(String[] args)
	{
		String pkline="+legajo-nombre+fecha";
		String[][] x = getKeys(pkline);
		
		for(int i=0; i<x.length; i++)
		{
			System.out.println(x[i][0]+", "+x[i][1]);
		}
	}
}
