package com.thejavalistener.post.jndiinstrospector;

import javax.ejb.Stateless;

@Stateless
public class MiEJB 
{
	public String saludar(String nombre)
	{
		return "Hola, "+nombre;
	}
}
