package com.thejavalistener.post.serialzable;

import java.util.Date;

import com.thejavalistener.foo.Alumno;
import com.thejavalistener.util.USerializable;

public class USerializableTest
{
	public static void main(String[] args)
	{
		// instancio un alumno
		Alumno a=new Alumno(10,"Pedro",new Date());
		
		// lo convierto en un array de bytes
		byte[] arr=USerializable.toBytes(a);

		// convierto el array de bytes en un objeto alumno
		Alumno b=(Alumno)USerializable.toObject(arr);
		
		// muestro el objeto recuperado
		System.out.println(b);
	}
}