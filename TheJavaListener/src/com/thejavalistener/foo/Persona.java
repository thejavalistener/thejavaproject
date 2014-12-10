package com.thejavalistener.foo;

import java.util.Date;

public class Persona implements Comparable<Persona>
{
	private int dni;
	private String nombre;
	private Date fechaNacimiento;

	public Persona()
	{
	}

	public Persona(int d,String n,Date f)
	{
		this.dni=d;
		this.nombre=n;
		this.fechaNacimiento=f;
	}

	@Override
	public int compareTo(Persona otra)
	{
		return this.dni-otra.dni;
	}

	@Override
	public boolean equals(Object obj)
	{
		return compareTo((Persona)obj)==0;
	}

	@Override
	public String toString()
	{
		return "Persona [dni="+dni+", nombre="+nombre+", fechaNacimiento="+fechaNacimiento+"]";
	}

	// setters y getters

	public int getDni()
	{
		return dni;
	}

	public void setDni(int dni)
	{
		this.dni=dni;
	}

	public String getNombre()
	{
		return nombre;
	}

	public void setNombre(String nombre)
	{
		this.nombre=nombre;
	}

	public Date getFechaNacimiento()
	{
		return fechaNacimiento;
	}

	public void setFechaNacimiento(Date fechaNacimiento)
	{
		this.fechaNacimiento=fechaNacimiento;
	}
}