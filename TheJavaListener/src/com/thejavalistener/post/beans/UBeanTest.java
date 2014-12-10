package com.thejavalistener.post.beans;

import java.util.Date;

import com.thejavalistener.foo.Alumno;
import com.thejavalistener.util.UBean;

public class UBeanTest
{
	public static void main(String[] args)
	{
		Alumno a=new Alumno(10,"Pablo",new Date());
		
		// obtengo los nombres de todos los atributos de 
		// la clase (legajo, nombre y fecha)
		String[] attNames=UBean.getAttNames(Alumno.class);
		
		// para cada atributo...
		for(String att:attNames)
		{
			// invoco al getter y muetro el toString por consola
			System.out.println(att+"="+UBean.invokeGetter(a,att));
		}
	}
}
