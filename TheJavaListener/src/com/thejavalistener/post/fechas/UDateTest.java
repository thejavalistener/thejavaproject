package com.thejavalistener.post.fechas;

import com.thejavalistener.util.UDate;

public class UDateTest
{
	public static void main(String[] args)
	{
		// obtengo la fecha de hoy y la muestro
		String hoy=UDate.now();
		System.out.println(hoy);
		
		// le sumo 10 dias y muestro el resultado
		int nDias=10;
		String sum=UDate.addDays(hoy,nDias);
		System.out.println(sum);
	}
}