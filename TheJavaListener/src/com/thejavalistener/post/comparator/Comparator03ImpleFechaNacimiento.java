package com.thejavalistener.post.comparator;

import java.util.Comparator;

import com.thejavalistener.foo.Persona;

public class Comparator03ImpleFechaNacimiento implements Comparator<Persona>
{
	@Override
	public int compare(Persona p1, Persona p2)
	{
		long f1=p1.getFechaNacimiento().getTime();
		long f2=p2.getFechaNacimiento().getTime();
		
		int diff=f1>f2?1:f1<f2?-1:0;
		
		return diff!=0?p1.getNombre().compareTo(p2.getNombre()):diff;
	}
}