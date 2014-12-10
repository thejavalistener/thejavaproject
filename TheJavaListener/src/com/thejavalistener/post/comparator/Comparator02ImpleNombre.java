package com.thejavalistener.post.comparator;

import java.util.Comparator;

import com.thejavalistener.foo.Persona;

public class Comparator02ImpleNombre implements Comparator<Persona>
{
	@Override
	public int compare(Persona p1, Persona p2)
	{
		int cmpNombre=p1.getNombre().compareTo(p2.getNombre());
		return cmpNombre!=0?cmpNombre:p1.getDni()-p2.getDni();
	}
}