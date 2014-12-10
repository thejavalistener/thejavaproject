package com.thejavalistener.post.comparator;

import java.util.Comparator;

import com.thejavalistener.foo.Persona;

public class Comparator01ImpleDNI implements Comparator<Persona>
{
	@Override
	public int compare(Persona p1, Persona p2)
	{
		return p1.getDni()-p2.getDni();
	}
}
