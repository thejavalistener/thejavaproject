package com.thejavalistener.post.fechas;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class FechaActual
{
	public static void main(String[] args)
	{
		// obtengo la fecha de hoy como un timestamp
		long hoy=System.currentTimeMillis();
		
		// instancio un GregorianCalendar y le seteo la fecha de hoy
		GregorianCalendar g=new GregorianCalendar();
		g.setTimeInMillis(hoy);
		
		// obtengo el dia, mes y anio
		int dia=g.get(Calendar.DAY_OF_MONTH);
		int mes=g.get(Calendar.MONTH)+1;
		int anio=g.get(Calendar.YEAR);
		
		// muestro
		String sFecha=dia+"/"+mes+"/"+anio;
		System.out.println(sFecha);
		
		// obtengo hora, munuto, segundo y milisegundo
		int hora=g.get(Calendar.HOUR);
		int min=g.get(Calendar.MINUTE)+1; // el mes comienza desde cero
		int sec=g.get(Calendar.SECOND);
		int mili=g.get(Calendar.MILLISECOND);
		
		// muestro
		String sHora=hora+":"+min+":"+sec+" ("+mili+")";
		System.out.println(sHora);
	}
}