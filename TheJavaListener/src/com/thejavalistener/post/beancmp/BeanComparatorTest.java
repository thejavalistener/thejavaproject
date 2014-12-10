package com.thejavalistener.post.beancmp;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.List;

import com.thejavalistener.foo.Persona;
import com.thejavalistener.util.UDate;
import com.thejavalistener.util.beancmp.BeanComparator;

public class BeanComparatorTest
{
	public static void main(String[] args)
	{
		// coleccion de personas
		ArrayList<Persona> arr = new ArrayList<>();
		arr.add(new Persona(20,"Pablo",new Date(UDate.stringToLong("1985/10/23"))));
		arr.add(new Persona(10,"Juan",new Date(UDate.stringToLong("1990/08/13"))));
		arr.add(new Persona(30,"Alberto",new Date(UDate.stringToLong("1970/04/18"))));
		arr.add(new Persona(50,"Juan",new Date(UDate.stringToLong("1981/12/5"))));
		arr.add(new Persona(70,"Rolando",new Date(UDate.stringToLong("1985/07/15"))));
		arr.add(new Persona(40,"Pablo",new Date(UDate.stringToLong("1995/03/12"))));
		arr.add(new Persona(60,"Alberto",new Date(UDate.stringToLong("1973/12/01"))));
		
		// defino el criterio: nombre+dni
		String pkline = "nombre+dni";
		BeanComparator<Persona> comp = new BeanComparator<Persona>(pkline);
		
		// ordeno y muestro
		Collections.sort(arr, comp);
		mostrarLista(arr);
		
		pkline = "-nombre+fechaNacimiento";
		comp = new BeanComparator<Persona>(pkline);		
		Collections.sort(arr, comp);
		
		mostrarLista(arr);
		
	}
	
	public static void mostrarLista(List<Persona> lst)
	{
		System.out.println("---");
		for(Persona p: lst)
		{
			System.out.println(p);
		}
	}
}
