package com.thejavalistener.foo;

import java.io.Serializable;
import java.util.Date;

public class Alumno implements Serializable
{
	private int legajo;
	private String nombre;
	private Date fecha;

	public Alumno(){}
	
	public Alumno(int le,String no,Date fe)
	{
		legajo=le;
		nombre=no;
		fecha=fe;
    }

	@Override
	public String toString()
	{
		return "Alumno [legajo="+legajo+", nombre="+nombre+", fecha="+fecha+"]";
	}

	// 
	// setters y getters
	// 
	
	public int getLegajo()
	{
		return legajo;
	}

	public void setLegajo(int legajo)
	{
		this.legajo=legajo;
	}

	public String getNombre()
	{
		return nombre;
	}

	public void setNombre(String nombre)
	{
		this.nombre=nombre;
	}

	public Date getFecha()
	{
		return fecha;
	}

	public void setFecha(Date fecha)
	{
		this.fecha=fecha;
	}
}
