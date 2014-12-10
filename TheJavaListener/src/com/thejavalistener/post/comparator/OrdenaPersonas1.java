package com.thejavalistener.post.comparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.List;

import com.thejavalistener.foo.Persona;
import com.thejavalistener.util.UDate;

public class OrdenaPersonas1
{
	public static void main(String[] args)
	{
		// obtengo la lista de personas
		List<Persona> listaPersonas=obtenerPersonas();
		
		// ordeno la lista de personas
		Collections.sort(listaPersonas);
		
		// recorro y muestro la lista de personas
		for(Persona p:listaPersonas)
		{
			System.out.println(p);
		}
	}

	private static List<Persona> obtenerPersonas()
	{
		ArrayList<Persona> lista=new ArrayList<>();
		lista.add(new Persona(3020,"Pablo",new Date(UDate.stringToLong("1970/10/2"))));
		lista.add(new Persona(1060,"Juan",new Date(UDate.stringToLong("1985/6/14"))));
		lista.add(new Persona(2040,"Pedro",new Date(UDate.stringToLong("1991/3/26"))));
		return lista;
	}
}
